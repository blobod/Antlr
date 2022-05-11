import Expression.Number;
import Expression.*;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    private Map<String, Integer> values;

    public AntlrToExpression(List<String> semanticErrors) {
        vars = new ArrayList<>();
        values = new HashMap<>();
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
        Expression condition = visit(ctx.getChild(2).getChild(0));
        int left = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(0).getText());
        int right = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(2).getText());
        String symbol = ctx.getChild(2).getChild(0).getChild(1).getText();
        Expression body;
        List<Expression> bodyList = new ArrayList<Expression>();

        boolean check = ConditionCheck(left, symbol, right);
        int i = 5;
        if (check){
            while (i != ctx.getChildCount() - 1){
                body = visit(ctx.getChild(i));
                bodyList.add(body);
                i++;
            }
        }
        return new If(condition, bodyList);
    }

    @Override
    public Expression visitElse(languageParser.ElseContext ctx) {

        return visitChildren(ctx); }

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
        System.out.println(ctx.getChild(2).getChild(0).getText());
        int left = 0;
        int right = 0;
        boolean check = false;
        try {
            left = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(0).getText());
        }catch (NumberFormatException e){
            left = values.get(ctx.getChild(2).getChild(0).getChild(0).getText());
        }
        try {
            right = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(2).getText());
        }catch (NumberFormatException e){
            right = values.get(ctx.getChild(2).getChild(0).getChild(2).getText());
        }
        String symbol = ctx.getChild(2).getChild(0).getChild(1).getText();
        check = ConditionCheck(left, symbol, right);
        List<Expression> bodyList = new ArrayList<>();
        int i = 5;
        int y = 0;
        while (check) {
            try {
                left = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(0).getText());
            }catch (NumberFormatException e){
                left = values.get(ctx.getChild(2).getChild(0).getChild(0).getText());
            }
            try {
                right = Integer.parseInt(ctx.getChild(2).getChild(0).getChild(2).getText());
            }catch (NumberFormatException e){
                right = values.get(ctx.getChild(2).getChild(0).getChild(2).getText());
            }
            while (i != ctx.getChildCount() - 1){
                Expression body = visit(ctx.getChild(i));
                bodyList.add(body);
                System.out.println(ctx.getChild(i).getText());
                i++;
                if (body instanceof Break) {
                    break;
                }
            }
            i = 5;
            y++;

            System.out.println("while loop " + y + "\n");

            check = ConditionCheck(left, symbol, right);
        }

        return new While(condition, bodyList);

    }

    public boolean ConditionCheck(int left, String symbol, int right){
        boolean check = false;
        switch (symbol) {
            case "<" -> check = left < right;
            case ">" -> check = left > right;
            case "==" -> check = left == right;
            case "<=" -> check = left <= right;
            case ">=" -> check = left >= right;
            case "!=" -> check = left != right;
            default -> System.out.println("This symbol does not exist");
        }
        return check;
    }

    @Override
    public Expression visitForever_loop(languageParser.Forever_loopContext ctx) {
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


    @Override
    public Expression visitCondition(languageParser.ConditionContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Expression visitPrint(languageParser.PrintContext ctx) {
        String leftID = ctx.getChild(2).getChild(0).getText();

        String rightID = " ";
        int left = 0;
        int right = 0;
        int result = 0;
        try {
            rightID = ctx.getChild(2).getChild(2).getText();
            if (ctx.getChild(2).getChild(1).getText().equals("-")) {
                if (Check(leftID)) {
                    left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());

                } else {
                    left = values.get(leftID);
                }
                if (Check(rightID)) {
                    right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
                } else {
                    right = values.get(rightID);
                }
                result = left - right;
                System.out.println(result);
            } else if (ctx.getChild(2).getChild(1).getText().equals("+")) {
                if (Check(leftID)) {
                    left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());

                } else {
                    left = values.get(leftID);
                }
                if (Check(rightID)) {
                    right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
                } else {
                    right = values.get(rightID);
                }
                result = left + right;
                System.out.println(result);
            } else if (ctx.getChild(2).getChild(1).getText().equals("*")) {
                if (Check(leftID)) {
                    left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());

                } else {
                    left = values.get(leftID);
                }
                if (Check(rightID)) {
                    right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
                } else {
                    right = values.get(rightID);
                }
                result = left * right;
                System.out.println(result);
            } else if (ctx.getChild(2).getChild(1).getText().equals("/")) {
                if (Check(leftID)) {
                    left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());

                } else {
                    left = values.get(leftID);
                }
                if (Check(rightID)) {
                    right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
                } else {
                    right = values.get(rightID);
                }
                result = left / right;
                System.out.println(result);
            } else if (ctx.getChild(2).getChild(1).getText().equals("^")) {
                if (Check(leftID)) {
                    left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());

                } else {
                    left = values.get(leftID);
                }
                if (Check(rightID)) {
                    right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
                } else {
                    right = values.get(rightID);
                }
                double resultDouble = Math.pow(left, right);
                System.out.println(resultDouble);
            }
        }catch (NullPointerException e){
            if (vars.contains(leftID)) {
                result = values.get(leftID);
                System.out.println(result + "\n");
            } else {
                System.out.println("Print statement is empty. ");
            }
        }

       return visitChildren(ctx);
    }

    public boolean Check(String id) {
        try {
            Integer.parseInt(id);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public Expression visitType_definition(languageParser.Type_definitionContext ctx) {


        String id = ctx.getChild(1).getText();
        int value = Integer.parseInt(ctx.VALUE().getText());
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared ");
        } else {
            vars.add(id);
            values.put(id, value);
        }

        String type = ctx.getChild(0).getText();
        System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        return new VariableDeclaration(id, type, value);
    }

    @Override
    public Expression visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        int left = 0, right = 0;
        try {
            left = Integer.parseInt(ctx.getChild(2).getChild(0).getText());
        }catch (NumberFormatException e){
            left = values.get(ctx.getChild(2).getChild(0).getText());
        }
        try {
            right = Integer.parseInt(ctx.getChild(2).getChild(2).getText());
        }catch (NumberFormatException e){
            right = values.get(ctx.getChild(2).getChild(2).getText());
        }
        int value = 0;
        double doubleValue;
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared ");
        }
        if (ctx.getChild(2).getChild(1).getText().equals("+")) {

            value =  left + right;
        } else if (ctx.getChild(2).getChild(1).getText().equals("-")) {
            value = left - right;
        } else if (ctx.getChild(2).getChild(1).getText().equals("*")) {
            value = left * right;
        } else if (ctx.getChild(2).getChild(1).getText().equals("/")) {
            value = left / right;
        } else {
            doubleValue = Math.pow(left, right);
        }
        values.put(id, value); // Does not work with power, because hashmap can only contain string and integer.
        System.out.print("TYPE RE-DEF OF " + id + " TO " + value + "\n");
        return new VariableReDeclaration(id, value);
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
    public Expression visitGreatherThan(languageParser.GreatherThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));

        return visitChildren(ctx);
    }


    @Override
    public Expression visitLesserThan(languageParser.LesserThanContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitEqualWith(languageParser.EqualWithContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitGreatherorEqualThan(languageParser.GreatherorEqualThanContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Expression visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) {
        return visitChildren(ctx);
    }
}

