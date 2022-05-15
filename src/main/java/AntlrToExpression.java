import Expression.Number;
import Expression.*;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.*;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    private Map<String, Integer> intValues;
    private Map<String, String> txtValues;
    private Map<String, Boolean> boolValues;

    public AntlrToExpression(List<String> semanticErrors) {
        vars = new ArrayList<>();
        intValues = new HashMap<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitAddition(languageParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitSubstraktion(languageParser.SubstraktionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Substraktion(left, right);
    }

    @Override
    public Expression visitMultiplication(languageParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitDivision(languageParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        return new Division(left, right);
    }

    @Override
    public Expression visitPower_of(languageParser.Power_ofContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        return new Power_Of(left, right);
    }

    @Override
    public Expression visitBigger_expression(languageParser.Bigger_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitParanthesis(languageParser.ParanthesisContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitVariable(languageParser.VariableContext ctx) {
        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }


    @Override
    public Expression visitIf(languageParser.IfContext ctx) {
        Expression condition = visit(ctx.getChild(2));
        ArrayList<Expression> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new If(condition, bodyList);
    }

    @Override
    public Expression visitElse(languageParser.ElseContext ctx) {
        Expression condition = visit(ctx.getChild(2));
        List<Expression> bodyList = new ArrayList<>();
        List<Expression> elseList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        for (int i = 0; i < ctx.getChild(9).getChildCount(); i++){
            elseList.add(visit(ctx.getChild(9).getChild(i)));
        }

        return new If_else(condition, bodyList, elseList);
    }

    @Override
    public Expression visitBreak_statement(languageParser.Break_statementContext ctx) {
        return new Break();
    }


    @Override
    public Expression visitFor_loop(languageParser.For_loopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitWhile_loop(languageParser.While_loopContext ctx) {
        Expression condition = visit(ctx.getChild(2));
        ArrayList<Expression> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new While(condition, bodyList);
    }

    @Override
    public Expression visitForever_loop(languageParser.Forever_loopContext ctx) {
        ArrayList<Expression> bodyList = new ArrayList<>();
            for (int i = 0; i < ctx.getChild(2).getChildCount(); i++) {
                bodyList.add(visit(ctx.getChild(2).getChild(i)));
            }
        return new Forever_Loop(bodyList);
        }


    @Override
    public Expression visitPrint(languageParser.PrintContext ctx) {
        Expression body = visit(ctx.getChild(2));
        return new Print(body);
    }

    @Override
    public Expression visitType_definition(languageParser.Type_definitionContext ctx) {
        System.out.println();
        String id = ctx.getChild(1).getText();
        int value = Integer.parseInt(ctx.getChild(3).getText());
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared ");
        } else {
            vars.add(id);
            intValues.put(id, value);
        }
        String type = ctx.getChild(0).getText();
        System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        return new VariableDeclaration(id, type, value);
    }

    @Override
    public Expression visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        Expression expression = visit(ctx.getChild(2));
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared ");
        }
        System.out.print("TYPE RE-DEF OF " + id + " TO " + expression + "\n");
        return new VariableReDeclaration(id, expression);
    }

    @Override
    public Expression visitFunction_declaration(languageParser.Function_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitParam(languageParser.ParamContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitGreaterThan(languageParser.GreaterThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new GreaterThan(left, right);
    }


    @Override
    public Expression visitLesserThan(languageParser.LesserThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new LesserThan(left, right);
    }

    @Override
    public Expression visitEqualWith(languageParser.EqualWithContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new EqualWith(left, right);
    }

    @Override
    public Expression visitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new GreaterorEqualThan(left, right);
    }


    @Override
    public Expression visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new LesserorEqualThan(left, right);
    }

    @Override
    public Expression visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new isNotEqualWith(left, right);
    }
}

