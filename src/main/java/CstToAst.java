import AstNodes.IntType;
import AstNodes.*;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.*;

public class CstToAst extends languageBaseVisitor<AstNode> {
    public CstToAst() {
    }

    @Override
    public AstNode visitLanguage(languageParser.LanguageContext ctx) {
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(0).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(0).getChild(i)));
        }
        return new Language(bodyList);
    }
    @Override
    public AstNode visitAddition(languageParser.AdditionContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Addition node
        AstNode right = visit(ctx.getChild(2)); // recursively visit the right subtree of the current Addition node
        return new Addition(left, right, false);
    }

    @Override
    public AstNode visitSubstraktion(languageParser.SubstraktionContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new Substraktion(left, right, false);
    }

    @Override
    public AstNode visitMultiplication(languageParser.MultiplicationContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new Multiplication(left, right, false);
    }

    @Override
    public AstNode visitDivision(languageParser.DivisionContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current MUltiplication node
        AstNode right = visit(ctx.getChild(2));
        return new Division(left, right, false);
    }

    @Override
    public AstNode visitVariable(languageParser.VariableContext ctx) {
        String id = ctx.getChild(0).getText();
        return new Variable(id);
    }

    @Override public AstNode visitInteger_NUM(languageParser.Integer_NUMContext ctx){
        String numText = ctx.getChild(0).getText();
        int num = java.lang.Integer.parseInt(numText);
        return new IntType(num);
    }

    @Override
    public AstNode visitDouble_NUM(languageParser.Double_NUMContext ctx) {
        String numText = ctx.getChild(0).getText();
        double doub = java.lang.Double.parseDouble(numText);
        return new DoubleType(doub);
    }

    @Override public AstNode visitString(languageParser.StringContext ctx) {
        String txtText = ctx.getChild(0).getText();
        return new TxtType(txtText);
    }

    @Override public AstNode visitBool(languageParser.BoolContext ctx) {
        String txtText = ctx.getChild(0).getText();
        boolean bool = Boolean.parseBoolean(txtText);
        return new BooleanType(bool);
    }
    @Override
    public AstNode visitIf(languageParser.IfContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new If(condition, bodyList);
    }

    @Override
    public AstNode visitElse(languageParser.ElseContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        List<AstNode> bodyList = new ArrayList<>();
        List<AstNode> elseList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        for (int i = 0; i < ctx.getChild(9).getChildCount(); i++){
            elseList.add(visit(ctx.getChild(9).getChild(i)));
        }

        return new If_else(condition, bodyList, elseList);
    }

    @Override
    public AstNode visitBreak_statement(languageParser.Break_statementContext ctx) {
        return new Break();
    }

    @Override
    public AstNode visitStop(languageParser.StopContext ctx) {
        return new Stop(); }

    @Override
    public AstNode visitFor_loop(languageParser.For_loopContext ctx) {
        AstNode initialization = visit(ctx.getChild(2));
        AstNode condition = visit(ctx.getChild(4));
        AstNode expression = visit(ctx.getChild(6));
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(9).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(9).getChild(i)));
        }
        return new ForLoop(initialization, condition, expression, bodyList);
    }

    @Override
    public AstNode visitWhile_loop(languageParser.While_loopContext ctx) {
        AstNode condition = visit(ctx.getChild(2));
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(5).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(5).getChild(i)));
        }
        return new While(condition, bodyList);
    }

    @Override
    public AstNode visitForever_loop(languageParser.Forever_loopContext ctx) {
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(2).getChildCount(); i++) {
            bodyList.add(visit(ctx.getChild(2).getChild(i)));
        }
        return new Forever_Loop(bodyList);
    }


    @Override
    public AstNode visitPrint(languageParser.PrintContext ctx) {
        AstNode body = visit(ctx.getChild(2));
        return new Print(body);
    }

    @Override
    public AstNode visitPrintln(languageParser.PrintlnContext ctx) {
        AstNode body = visit(ctx.getChild(2));
        return new Println(body);
    }

    @Override
    public AstNode visitInput(languageParser.InputContext ctx){
        AstNode body = visit(ctx.getChild(2));
        return new Input(body);
    }

    @Override public AstNode visitVar_dec_with_value(languageParser.Var_dec_with_valueContext ctx) {
        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
        AstNode value = visit(ctx.getChild(3));
        return new VariableDeclarationWithValue(id, type, value, false);
    }

    @Override public AstNode visitVar_dec_no_value(languageParser.Var_dec_no_valueContext ctx) {
        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();

        return new VariableDeclarationNoValue(type, id);
    }

    @Override
    public AstNode visitType_reassign(languageParser.Type_reassignContext ctx) {
        String id = ctx.getChild(0).getText();
        AstNode value = visit(ctx.getChild(2));
        return new VariableReDeclaration(id, value, false);
    }

    @Override
    public AstNode visitFuncWithReturn(languageParser.FuncWithReturnContext ctx) {
        int type = 0, id = 1, param = 3, body = 6, value = 8;
        String FunctionType = ctx.getChild(type).getText();
        String FunctionId = ctx.getChild(id).getText();
        ArrayList<AstNode> parameter = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(param).getChildCount(); i = i + 2){
            parameter.add(visit(ctx.getChild(param).getChild(i)));
        }
        if (parameter.isEmpty()){
            body = 5;
        }
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(body).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(body).getChild(i)));
        }
        if (bodyList.isEmpty() && parameter.isEmpty()){
            value = 6;
        }else if(bodyList.isEmpty() || parameter.isEmpty()){
            value = 7;
        }
        AstNode returnValue = visit(ctx.getChild(value));
        return new FunctionsWithReturn(FunctionType, FunctionId, parameter, bodyList, returnValue);
    }

    @Override public AstNode visitFuncVoid(languageParser.FuncVoidContext ctx) {
        String FunctionType = ctx.getChild(0).getText();
        String FunctionId = ctx.getChild(1).getText();
        ArrayList<AstNode> parameter = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(3).getChildCount(); i = i + 2){
            parameter.add(visit(ctx.getChild(3).getChild(i)));
        }
        ArrayList<AstNode> bodyList = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(6).getChildCount(); i++){
            bodyList.add(visit(ctx.getChild(6).getChild(i)));
        }
        return new FunctionsWithoutReturn(FunctionType, FunctionId, parameter, bodyList);
    }

    @Override public AstNode visitFunction_call(languageParser.Function_callContext ctx)    {
        String id = ctx.getChild(0).getText();
        ArrayList<AstNode> parameter = new ArrayList<>();
        for (int i = 0; i < ctx.getChild(2).getChildCount(); i = i + 2){
            parameter.add(visit(ctx.getChild(2).getChild(i)));
        }
    return new FunctionCall(parameter, id);
    }


    @Override
    public AstNode visitGreaterThan(languageParser.GreaterThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new GreaterThan(left, right, false);
    }


    @Override
    public AstNode visitLesserThan(languageParser.LesserThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new LesserThan(left, right, false);
    }

    @Override
    public AstNode visitEqualWith(languageParser.EqualWithContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new EqualWith(left, right, false);
    }

    @Override
    public AstNode visitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new GreaterorEqualThan(left, right, false);
    }


    @Override
    public AstNode visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new LesserorEqualThan(left, right, false);
    }

    @Override
    public AstNode visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx) {
        AstNode left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current Multiplication node
        AstNode right = visit(ctx.getChild(2));
        return new isNotEqualWith(left, right, false);
    }
}


