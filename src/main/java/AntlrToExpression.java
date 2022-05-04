import Expression.*;
import Expression.Number;
import grammar.*;

import java.security.KeyStore;
import java.util.*;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    private Map<String, Integer> values;
    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        values = new HashMap<>();
        this.semanticErrors = semanticErrors;
    }

    @Override public Expression visitAddition(languageParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right); }

    @Override public Expression visitSubstraktion(languageParser.SubstraktionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Substraktion(left, right); }

    @Override public Expression visitMultiplication(languageParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override public Expression visitDivision(languageParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        return new Division(left, right);
    }

    @Override public Expression visitPower_of(languageParser.Power_ofContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        return new Power_Of(left, right);
    }

    @Override public Expression visitBigger_expression(languageParser.Bigger_expressionContext ctx) {
        return visitChildren(ctx);}

    @Override public Expression visitParanthesis(languageParser.ParanthesisContext ctx) {
        return visitChildren(ctx); }

    @Override public Expression visitVariable(languageParser.VariableContext ctx) {
        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " not declared" );
        }
        return new Variable(id);
    }

    @Override public Expression visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override public Expression visitConditional_statement(languageParser.Conditional_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIf_statement(languageParser.If_statementContext ctx) {
        List<languageParser.ConditionContext> conditions = ctx.condition();

        boolean evalutedBlock = false;

        //iterating through each one and evaluates its getchild value (true of false)
        for (grammar.languageParser.ConditionContext condition : conditions){
            Expression evaluated = this.visit(ctx.condition());

            //try to check if evaluated is a boolean or not!!
            if (Boolean.valueOf(evaluated) = true){
                evalutedBlock = true;
                this.visit(ctx.stmt());
                break;
            }
        }
        if (!evalutedBlock && ctx.children != null){
            this.visit(ctx.stmt());
        }
        return visitChildren(ctx); }


    @Override public Expression visitBreak_statement(languageParser.Break_statementContext ctx) {
     return new Break();
    }



    @Override public Expression visitIterative_statement(languageParser.Iterative_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitFor_loop(languageParser.For_loopContext ctx) {
        System.out.print("hello");
        return visitChildren(ctx); }

    @Override public Expression visitWhile_loop(languageParser.While_loopContext ctx) {
        System.out.print("hello");
        return visitChildren(ctx); }

    @Override public Expression visitForever_loop(languageParser.Forever_loopContext ctx) {
        Forever_Loop loop = new Forever_Loop();
        boolean breaking = false;
        while (!breaking) {
            for (int i = 2; i < ctx.getChildCount() - 1; i++) {
                Expression child = visit(ctx.getChild(i));
                if (child instanceof Break) {
                    breaking = true;
                    break;
                }
                loop.add(child);
                System.out.println(ctx.getChild(i).getText());
            }
        }
        return loop;
    }


    @Override public Expression visitCondition(languageParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitPrint(languageParser.PrintContext ctx) {
        String id = ctx.getChild(2).getText();
        int left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());
        int right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        int result = 0;
        if(vars.contains(id)){

            int value = values.get(id);
            System.out.println(value + "\n");
        }else if(ctx.getChild(2).getChild(1).getText().equals("+")){
            result = left + right;
            System.out.print(result);
        }




        return visitChildren(ctx); }

    @Override public Expression visitType_definition(languageParser.Type_definitionContext ctx) {


        String id = ctx.getChild(1).getText();
        int value = Integer.parseInt(ctx.VALUE().getText());
        if (vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " already declared ");
        }else{
            vars.add(id);
            values.put(id, value);
        }

        String type = ctx.getChild(0).getText();
        System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        return new VariableDeclaration(id, type, value);
    }

    @Override public Expression visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        int value = 0;
        if (!vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " not declared ");
        }
        if (ctx.getChild(2).getChild(1).getText().equals("+")) {
            value = Integer.parseInt(ctx.getChild(2).getChild(0).getText()) + Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        }else if(ctx.getChild(2).getChild(1).getText().equals("-")){
            value = Integer.parseInt(ctx.getChild(2).getChild(0).getText()) - Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        } else if (ctx.getChild(2).getChild(1).getText().equals("*")){
            value = Integer.parseInt(ctx.getChild(2).getChild(0).getText()) * Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        } else if (ctx.getChild(2).getChild(1).getText().equals("/")){
            value = Integer.parseInt(ctx.getChild(2).getChild(0).getText()) / Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        } else{
            value = Integer.parseInt(ctx.getChild(2).getChild(0).getText()) ^ Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        }
        System.out.print("Before : " + values.toString() + " \n");
        values.put(id, value);
        System.out.print("After : " + values.toString() + " \n");
        System.out.print("TYPE RE-DEF OF " + id + " TO "  + value + "\n");
        return new VariableReDeclaration(id, value); }

    @Override public Expression visitFunction_declaration(languageParser.Function_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Expression visitParam(languageParser.ParamContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitGreatherThan(languageParser.GreatherThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));

        return new GreaterThan(left, right);
    }


    @Override public Expression visitLesserThan(languageParser.LesserThanContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitEqualWith(languageParser.EqualWithContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitGreatherorEqualThan(languageParser.GreatherorEqualThanContext ctx) { return visitChildren(ctx); }


    @Override public Expression visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) { return visitChildren(ctx); }
}

