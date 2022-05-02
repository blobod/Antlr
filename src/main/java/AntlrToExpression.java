import Expression.*;
import Expression.Number;
import grammar.*;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared

    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override public Expression visitAddition(languageParser.AdditionContext ctx) {
        System.out.println("addition");
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        System.out.println("left: " + left + " and right: " + right);
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

    @Override public Expression visitIf_statement(languageParser.If_statementContext ctx) { return visitChildren(ctx); }


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


    @Override public Expression visitType_definition(languageParser.Type_definitionContext ctx) {


        String id = ctx.getChild(1).getText();

        if (vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " already declared ");
        }else{
            vars.add(id);
        }


        String type = ctx.getChild(0).getText();
        int value = Integer.parseInt(ctx.VALUE().getText());
        System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        return new VariableDeclaration(id, type, value);
    }

    @Override public Expression visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        int value;
        if (!vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " not declared ");
        }
        if (ctx.getChild(2).getChild(1).getText().equals("+")) {
           // value = Integer.parseInt(ctx.VALUE().getChild(1).getChild(0).getText()) + Integer.parseInt(ctx.VALUE().getChild(2).getChild(2).getText());
            //System.out.print("this is an plus: with " + value + "\n");
        }

        return visitChildren(ctx); }

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

