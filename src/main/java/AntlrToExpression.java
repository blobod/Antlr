import AST2.*;
import AST2.Number;
import grammar.*;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared

    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override public Expression visitLanguage(languageParser.LanguageContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitEntrypoint(languageParser.EntrypointContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitDeclaration(languageParser.DeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitStmts(languageParser.StmtsContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitStmt(languageParser.StmtContext ctx) { return visitChildren(ctx); }

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
            semanticErrors.add("Error: variable" + id + " not declared" );
        }
        return new Variable(id);
    }

    @Override public Expression visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        System.out.println(num);
        return new Number(num);
    }

    @Override public Expression visitConditional_statement(languageParser.Conditional_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIf_statement(languageParser.If_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIterative_statement(languageParser.Iterative_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitFor_loop(languageParser.For_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitWhile_loop(languageParser.While_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitForever_loop(languageParser.Forever_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitCondition(languageParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitBoolean_expression(languageParser.Boolean_expressionContext ctx) { return visitChildren(ctx); }


    @Override public Expression visitType_definition(languageParser.Type_definitionContext ctx) {


        String id = ctx.getChild(1).getText();

        if (vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " already declared ");
            System.out.print(semanticErrors.get(0) + "\n");
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
