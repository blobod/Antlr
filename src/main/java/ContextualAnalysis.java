
import AstNodes.*;
import kotlin.reflect.jvm.internal.ReflectProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContextualAnalysis {
    public HashMap<String, AstNode> Variables;
    public HashMap<String, List<AstNode>> Functions;
    public ArrayList<String> typeChecking;
    public ArrayList<String> error;

    public ContextualAnalysis() {
        this.typeChecking = new ArrayList<>();
        this.error = new ArrayList<>();
    }

    public AstNode visitAST(AstNode astNode) throws Exception {
        if (typeChecking.isEmpty() || error.isEmpty()) {
            if (astNode instanceof Addition) {
                return visitExpression(((Addition) astNode).left, ((Addition) astNode).right);
            } else if (astNode instanceof Substraktion) {
                return visitExpression(((Substraktion) astNode).left, ((Substraktion) astNode).right);
            } else if (astNode instanceof Multiplication) {
                return visitExpression(((Multiplication) astNode).left, ((Multiplication) astNode).right);
            } else if (astNode instanceof Division) {
                return visitExpression(((Division) astNode).left, ((Division) astNode).right);
            } else if (astNode instanceof GreaterThan) {
                return visitConditionExpression(((GreaterThan) astNode).left, ((GreaterThan) astNode).right);
            } else if (astNode instanceof LesserThan) {
                return visitConditionExpression(((LesserThan) astNode).left, ((LesserThan) astNode).right);
            } else if (astNode instanceof GreaterorEqualThan) {
                return visitConditionExpression(((GreaterorEqualThan) astNode).left, ((GreaterorEqualThan) astNode).right);
            } else if (astNode instanceof LesserorEqualThan) {
                return visitConditionExpression(((LesserorEqualThan) astNode).left, ((LesserorEqualThan) astNode).right);
            } else if (astNode instanceof EqualWith) {
                return visitConditionExpression(((EqualWith) astNode).left, ((EqualWith) astNode).right);
            } else if (astNode instanceof isNotEqualWith) {
                return  visitConditionExpression(((isNotEqualWith) astNode).left, ((isNotEqualWith) astNode).right);
            } else if (astNode instanceof VariableDeclarationWithValue) {
                return new VariableDeclarationWithValue(((VariableDeclarationWithValue) astNode).type, ((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value, visitDeclaration(((VariableDeclarationWithValue) astNode).type, ((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value));
            }else if (astNode instanceof VariableDeclarationNoValue) {
                if (!Variables.containsKey(((VariableDeclarationNoValue) astNode).id) && ((VariableDeclarationNoValue) astNode).type.equals("int")){
                    Variables.put(((VariableDeclarationNoValue) astNode).id, new IntType(0));
                    return new VariableDeclarationWithValue(((VariableDeclarationNoValue) astNode).type, ((VariableDeclarationNoValue) astNode).id, new IntType(0), true);
                }else if (!Variables.containsKey(((VariableDeclarationNoValue) astNode).id) && ((VariableDeclarationNoValue) astNode).type.equals("double")){
                    Variables.put(((VariableDeclarationNoValue) astNode).id, new DoubleType(0.0));
                    return new VariableDeclarationWithValue(((VariableDeclarationNoValue) astNode).type, ((VariableDeclarationNoValue) astNode).id, new DoubleType(0.0), true);
                }else{
                    return visitAST(Variables.get(((VariableDeclarationNoValue) astNode).id));
                }
            }else if (astNode instanceof Variable) {
                return Variables.get(((Variable) astNode).id);
            }else if (astNode instanceof IntType) {
                return new IntType(((IntType) astNode).num);
            }else if (astNode instanceof DoubleType) {
                return new DoubleType(((DoubleType) astNode).doub);
            }else if (astNode instanceof TxtType) {
                return new TxtType(((TxtType) astNode).string);
            }else if (astNode instanceof BooleanType) {
                return new BooleanType(((BooleanType) astNode).bool);
            }
            else if (astNode instanceof VariableReDeclaration) {
                visitAST(((VariableReDeclaration) astNode).value);
                return new VariableReDeclaration(((VariableReDeclaration) astNode).id, visitAST(((VariableReDeclaration) astNode).value), visitAssign((((VariableReDeclaration) astNode).id), visitAST(((VariableReDeclaration) astNode).value)));
            } else if (astNode instanceof If) {
                int i = 0;
                var cont_type = visitAST(((If) astNode).condition);
                if (!(cont_type instanceof BooleanType)){
                    error.add("Wrong condition return type");
                }
                while (i < ((If) astNode).body.size()) {
                    visitAST(((If) astNode).body.get(i));
                    i++;
                }
                return new If(((If) astNode).condition, ((If) astNode).body);
            } else if (astNode instanceof If_else) {
                int i = 0;

                var cont_type = visitAST(((If_else) astNode).condition);
                if (!(cont_type instanceof BooleanType)){
                    error.add("Wrong condition return type");
                }
                while (i < ((If_else) astNode).body.size()) {
                    visitAST(((If_else) astNode).body.get(i));
                    i++;
                }
                i = 0;
                while (i < ((If_else) astNode).Else.size()) {
                    visitAST(((If_else) astNode).Else.get(i));
                    i++;
                }
                return new If_else(((If_else) astNode).condition, ((If_else) astNode).body, ((If_else) astNode).Else);
            } else if (astNode instanceof Forever_Loop) {
                int i = 0;
                while (i < ((Forever_Loop) astNode).body.size()) {
                    visitAST(((Forever_Loop) astNode).body.get(i));
                    i++;
                }
                return new Forever_Loop(((Forever_Loop) astNode).body);
            } else if (astNode instanceof Print) {
                visitAST(((Print) astNode).body);
                return new Print(((Print) astNode).body);
            } else if (astNode instanceof Println) {
                visitAST(((Println) astNode).body);
                return new Print(((Println) astNode).body);
            } else if (astNode instanceof While) {
                var cont_type = visitAST(((While) astNode).condition);
                if (!(cont_type instanceof BooleanType)){
                    error.add("Wrong condition return type");
                }
                int i = 0;
                while (i < ((While) astNode).body.size()) {
                    visitAST(((While) astNode).body.get(i));
                    i++;
                }
                return new While(((While) astNode).condition, ((While) astNode).body);
            } else if (astNode instanceof Language) {
                int i = 0;
                Variables = new HashMap<>();
                Functions = new HashMap<>();
                while (i < ((Language) astNode).body.size()) {
                    visitAST(((Language) astNode).body.get(i));
                    i++;
                }
                if (!typeChecking.isEmpty() || !error.isEmpty()) {
                    throw new Exception("Error during Contextual Analysis " + error.toString() + " and " + typeChecking.toString());
                }
                return new Language(((Language) astNode).body);
            } else if (astNode instanceof FunctionsWithReturn) {
                int i = 0, x = 0;
                while (i < ((FunctionsWithReturn) astNode).parameter.size()) {
                    visitAST(((FunctionsWithReturn) astNode).parameter.get(i));
                    i++;
                }
                while (x < ((FunctionsWithReturn) astNode).body.size()) {
                    visitAST(((FunctionsWithReturn) astNode).body.get(x));
                    x++;
                }
                visitFunctionDefinition(((FunctionsWithReturn) astNode).FunctionType, ((FunctionsWithReturn) astNode).FunctionId, ((FunctionsWithReturn) astNode).returnValue, ((FunctionsWithReturn) astNode).parameter);

            }else if (astNode instanceof FunctionsWithoutReturn) {
                int i = 0, x = 0;
                while (i < ((FunctionsWithoutReturn) astNode).parameter.size()) {
                    visitAST(((FunctionsWithoutReturn) astNode).parameter.get(i));
                    i++;
                }
                while (x < ((FunctionsWithoutReturn) astNode).body.size()) {
                    visitAST(((FunctionsWithoutReturn) astNode).body.get(x));
                    x++;
                }
                Variables.put(((FunctionsWithoutReturn) astNode).FunctionId, null);
                Functions.put(((FunctionsWithoutReturn) astNode).FunctionId, ((FunctionsWithoutReturn) astNode).parameter);
            }else if (astNode instanceof FunctionCall) {
                if (Variables.containsKey(((FunctionCall) astNode).functionID)){
                    visitFunctionCall(((FunctionCall) astNode).functionID, ((FunctionCall) astNode).parameter);
                }else {
                    error.add("Undefined Function Call");
                }
            }else if (astNode instanceof ReturnFunc) {
                return visitAST(((ReturnFunc) astNode).value);
            }else if (astNode instanceof FuncCallExpression) {
                return new FuncCallExpression(visitAST(((FuncCallExpression) astNode).func));
            }else if (astNode instanceof ForLoop) {
                int i = 0;
                visitAST(((ForLoop) astNode).initialization);
                var cont_type = visitAST(((ForLoop) astNode).condition);
                if (!(cont_type instanceof BooleanType)){
                    error.add("Wrong condition return type");
                }
                visitAST(((ForLoop) astNode).expression);
                while (i < ((ForLoop) astNode).body.size()) {
                    visitAST(((ForLoop) astNode).body.get(i));
                    i++;
                }
                return new ForLoop(((ForLoop) astNode).condition, ((ForLoop) astNode).initialization, ((ForLoop) astNode).expression, ((ForLoop) astNode).body);
            }
        } else {
            throw new Exception("Error in Contextual Analysis " + error.toString() + " and " + typeChecking.toString());
        }
        return null;
    }

    public AstNode visitExpression(AstNode left, AstNode right) throws Exception {
        AstNode leftValue = visitAST(left);
        AstNode rightValue = visitAST(right);
        if (leftValue instanceof IntType && rightValue instanceof IntType) {
            return leftValue;
        } else if (leftValue instanceof DoubleType && rightValue instanceof DoubleType) {
            return leftValue;
        } else {
            typeChecking.add("Error in expression. Types do not match.");
            return null;
        }
    }

    public AstNode visitConditionExpression(AstNode left, AstNode right) throws Exception {
        AstNode leftValue = visitAST(left);
        AstNode rightValue = visitAST(right);
        if (leftValue instanceof IntType && rightValue instanceof IntType) {
            return new BooleanType(true);
        } else if (leftValue instanceof DoubleType && rightValue instanceof DoubleType) {
            return new BooleanType(true);
        } else {
            typeChecking.add("Error in expression. Types do not match.");
            return null;
        }
    }

    public boolean visitDeclaration(String type, String id, AstNode value) {
        if (Variables.containsKey(id)) {
            error.add("Variable " + id + " is already declared");
            return false;
        }
        if (type.equals("int") && value instanceof IntType) {
            Variables.put(id, value);
            return true;
        } else if (type.equals("double") && value instanceof DoubleType) {
            Variables.put(id, value);
            return true;
        } else if (type.equals("txt") && value instanceof TxtType) {
            Variables.put(id, value);
            return true;
        } else if (type.equals("bool") && value instanceof BooleanType) {
            Variables.put(id, value);
            return true;
        } else {
            error.add("Error in Variable Declaration");
        }
        return false;
    }

    public boolean visitAssign(String id, AstNode value) throws Exception {
        if (Variables.containsKey(id)) {
            visitExpression(Variables.get(id), visitAST(value));
        } else {
            error.add("Error in variable assignment. Undeclared Variable");}

        return false;
    }

    public void visitFunctionDefinition(String FunctionType, String FunctionId, AstNode returnValue, List<AstNode> parameter) throws Exception {
        if (Variables.containsKey(FunctionId)) {
            error.add("Function " + FunctionId + " is already defined");
        }
        Variables.put(FunctionId, null);
        Functions.put(FunctionId, parameter);
        AstNode Value = visitAST(returnValue);
            if (FunctionType.equals("int") && Value instanceof IntType) {
            Variables.put(FunctionId, Value);
        } else if (FunctionType.equals("double") && Value instanceof DoubleType) {
            Variables.put(FunctionId, Value);
        } else if (FunctionType.equals("txt") && Value instanceof TxtType) {
            Variables.put(FunctionId, Value);
        } else if (FunctionType.equals("bool") && Value instanceof BooleanType) {
            Variables.put(FunctionId, Value);
        } else {
            error.add("The return value does not match the type of the function");
        }
    }

    public void visitFunctionCall(String id, List<AstNode> parameter) throws Exception {
        List<AstNode> FunctionReturn =  Functions.get(id);
        int i = 0;
        while (i < parameter.size()){
            visitExpression(visitAST(FunctionReturn.get(i)), parameter.get(i));
            i++;
        }
    }

}
