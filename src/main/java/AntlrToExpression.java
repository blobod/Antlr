import Expression.Number;
import Expression.*;
import grammar.languageBaseVisitor;
import grammar.languageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.math3.analysis.function.Exp;

import java.util.*;

public class AntlrToExpression extends languageBaseVisitor<Expression> {

    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    private List<String> typeErrors;
    private Map<String, Type> Values;
    public AntlrToExpression(List<String> semanticErrors, List<String> typeErrors) {
        vars = new ArrayList<>();
        Values = new HashMap<>();
        this.semanticErrors = semanticErrors;
        this.typeErrors = typeErrors;
    }

    @Override
    public Expression visitAddition(languageParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Addition node
        Expression right = visit(ctx.getChild(2)); // recursively visit the right subtree of the current Addition node
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Addition(left, right);
    }

    @Override
    public Expression visitSubstraktion(languageParser.SubstraktionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Substraktion(left, right);
    }

    @Override
    public Expression visitMultiplication(languageParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitDivision(languageParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Division(left, right);
    }

    @Override
    public Expression visitPower_of(languageParser.Power_ofContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new Power_Of(left, right);
    }

    @Override
    public Expression visitVariable(languageParser.VariableContext ctx) {
        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        Type num = new Type(numText);
        return new Number(num);
    }

    @Override public Expression visitString(languageParser.StringContext ctx) {
        String txtText = ctx.getChild(0).getText();
        Type txt = new Type(txtText);
        return new txt(txt);
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
    public Expression visitInput(languageParser.InputContext ctx){
        String id = ctx.getChild(2).getText();
        vars.add(id);
        Expression body = visit(ctx.getChild(2));

        return new Input(body);
    }

    @Override
    public Expression visitType_declaration(languageParser.Type_declarationContext ctx) {
        String id = ctx.getChild(1).getText();
        Type value = new Type(ctx.getChild(3).getText());
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared ");
        } else {
            vars.add(id);
            Values.put(id, value);
        }
        String type = ctx.getChild(0).getText();
        typeChecking check = new typeChecking(null, null);
        if(check.defChecker(type, value)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }else{
            System.out.print("TYPE DEF " + id + " " + type + " " + value + "\n");
        }
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
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new GreaterThan(left, right);
    }


    @Override
    public Expression visitLesserThan(languageParser.LesserThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new LesserThan(left, right);
    }

    @Override
    public Expression visitEqualWith(languageParser.EqualWithContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new EqualWith(left, right);
    }

    @Override
    public Expression visitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new GreaterorEqualThan(left, right);
    }


    @Override
    public Expression visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new LesserorEqualThan(left, right);
    }

    @Override
    public Expression visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) {
        Expression left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        typeChecking check = new typeChecking(left, right);
        if (check.expChecker(left, right)){
            typeErrors.add("Type Error: in " + ctx.getParent().getText());
        }
        return new isNotEqualWith(left, right);
    }
}

