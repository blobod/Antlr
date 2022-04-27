import Expression.*;
import Expression.Number;
import grammar.*;

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

    @Override public Expression visitIf_statement(languageParser.If_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIterative_statement(languageParser.Iterative_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitFor_loop(languageParser.For_loopContext ctx) {
        System.out.print("hello");
        return visitChildren(ctx); }

    @Override public Expression visitWhile_loop(languageParser.While_loopContext ctx) {
        System.out.print("hello");
        return visitChildren(ctx); }

    @Override public Expression visitForever_loop(languageParser.Forever_loopContext ctx) {
        Expression beginning = visit(ctx.getChild(0));
        int x = 0;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!Objects.equals(ctx.getChild(i).getText(), "}")) {
                System.out.print(ctx.getChild(i).getText() + "\n");
                x = i;
            }
        }
        Expression end = visit(ctx.getChild(x + 1));
        Expression block = visit(ctx.getChild(x));
        System.out.print(ctx.getChild(3).getText());
        return new Forever_Loop(beginning, block, end); }


    @Override public Expression visitCondition(languageParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitBoolean_expression(languageParser.Boolean_expressionContext ctx) { return visitChildren(ctx); }

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

    @Override public Expression visitFunction_declaration(languageParser.Function_declarationContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitParam(languageParser.ParamContext ctx) { return visitChildren(ctx); }



}
