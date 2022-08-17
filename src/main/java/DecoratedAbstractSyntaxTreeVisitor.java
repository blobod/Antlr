
import AstNodes.*;
import dAstNodes.Expression;
import dAstNodes.dAstNode;

import java.util.HashMap;
import java.util.List;

public class DecoratedAbstractSyntaxTreeVisitor {
    public HashMap<AstNode , Integer> identifiers;
    public HashMap<String, AstNode> Variables;
    public HashMap<String, Integer> Functions;
    int scope = 0;
    public AstNode visitAST(AstNode astNode) {
        if (astNode instanceof Addition){
                return new Addition(((Addition) astNode).left, ((Addition) astNode).right, visitExpression(((Addition) astNode).left, ((Addition) astNode).right));
            }
        else if(astNode instanceof Substraktion){
                return new Substraktion(((Substraktion) astNode).left, ((Substraktion) astNode).right ,visitExpression(((Substraktion) astNode).left, ((Substraktion) astNode).right));
            }
        else if(astNode instanceof Multiplication){
            return new Multiplication(((Multiplication) astNode).left, ((Multiplication) astNode).right, visitExpression(((Multiplication) astNode).left, ((Multiplication) astNode).right));
            }
        else if(astNode instanceof Division){
            return new Division(((Division) astNode).left, ((Division) astNode).right, visitExpression(((Division) astNode).left, ((Division) astNode).right));
            }
        else if(astNode instanceof GreaterThan){
            return new GreaterThan(((GreaterThan) astNode).left, ((GreaterThan) astNode).right, visitExpression(((GreaterThan) astNode).left, ((GreaterThan) astNode).right));
        }
        else if(astNode instanceof LesserThan){
            return new LesserThan(((LesserThan) astNode).left, ((LesserThan) astNode).right, visitExpression(((LesserThan) astNode).left, ((LesserThan) astNode).right));
        }
        else if(astNode instanceof GreaterorEqualThan){
            return new GreaterorEqualThan(((GreaterorEqualThan) astNode).left, ((GreaterorEqualThan) astNode).right, visitExpression(((GreaterorEqualThan) astNode).left, ((GreaterorEqualThan) astNode).right));
        }
        else if(astNode instanceof LesserorEqualThan){
            return new LesserorEqualThan(((LesserorEqualThan) astNode).left, ((LesserorEqualThan) astNode).right, visitExpression(((LesserorEqualThan) astNode).left, ((LesserorEqualThan) astNode).right));
        }
        else if(astNode instanceof EqualWith){
            return new EqualWith(((EqualWith) astNode).left, ((EqualWith) astNode).right, visitExpression(((EqualWith) astNode).left, ((EqualWith) astNode).right));
        }
        else if(astNode instanceof isNotEqualWith){
            return new isNotEqualWith(((isNotEqualWith) astNode).left, ((isNotEqualWith) astNode).right, visitExpression(((isNotEqualWith) astNode).left, ((isNotEqualWith) astNode).right));
        }
        else if(astNode instanceof VariableDeclaration){
            return new VariableDeclaration(((VariableDeclaration) astNode).type, ((VariableDeclaration) astNode).id, ((VariableDeclaration) astNode).value, visitDeclaration(((VariableDeclaration) astNode).type, ((VariableDeclaration) astNode).id, ((VariableDeclaration) astNode).value));
        }
        else if(astNode instanceof VariableReDeclaration){
            return new VariableReDeclaration(((VariableReDeclaration) astNode).id, ((VariableReDeclaration) astNode).expression, visitAssign(((VariableReDeclaration) astNode).id, ((VariableReDeclaration) astNode).expression));
        }
        else if(astNode instanceof If){
            scope++;
            int i = 0;
            visitAST(((If) astNode).condition);
            while(i <((If) astNode).body.size()){
                visitAST(((If) astNode).body.get(i));
                i++;
            }
            return new If(((If) astNode).condition, ((If) astNode).body);
        }
        else if(astNode instanceof If_else){
            scope++;
            int i = 0;
            visitAST(((If_else) astNode).condition);
            while(i <((If_else) astNode).body.size()){
                visitAST(((If_else) astNode).body.get(i));
                i++;
            }
            while(i <((If_else) astNode).Else.size()){
                visitAST(((If_else) astNode).Else.get(i));
                i++;
            }
            return new If_else(((If_else) astNode).condition, ((If_else) astNode).body, ((If_else) astNode).Else);
        }
        else if(astNode instanceof Forever_Loop) {
            scope++;
            int i = 0;
            while (i < ((Forever_Loop) astNode).body.size()) {
                visitAST(((Forever_Loop) astNode).body.get(i));
                i++;
            }
            return new Forever_Loop(((Forever_Loop) astNode).body);
        }
        else if(astNode instanceof Print){
                visitAST(((Print) astNode).body);
            System.out.println(Variables.get(((Print) astNode).body.toString()));
            return new Print(((Print) astNode).body);
            }
        else if(astNode instanceof While){
            scope++;
            visitAST(((While) astNode).condition);
            int i = 0;
            while(i <((While) astNode).body.size()){
                visitAST(((While) astNode).body.get(i));
                i++;
            }
            return new While(((While) astNode).condition, ((While) astNode).body);
        }else if(astNode instanceof Language){
            int i = 0;
            identifiers = new HashMap<>();
            Variables = new HashMap<>();
            Functions = new HashMap<>();
            while(i < ((Language) astNode).body.size()){
                visitAST(((Language) astNode).body.get(i));
                i++;
            }
            return new Language(((Language) astNode).body);
        }else if(astNode instanceof Functions){
            scope++;
            int i = 0, x = 0;
            while(i < ((Functions) astNode).parameter.size()){
                visitAST(((Functions) astNode).parameter.get(i));
                i++;
            }
            while(x < ((Functions) astNode).body.size()){
                visitAST(((Functions) astNode).body.get(x));
                x++;
            }
            visitFunctionDefinition(((Functions) astNode).FunctionType, ((Functions) astNode).FunctionId, ((Functions) astNode).parameter, ((Functions) astNode).body);

        }else if(astNode instanceof ForLoop){
            scope++;
            int i = 0;
            visitAST(((ForLoop) astNode).condition);
            visitAST(((ForLoop) astNode).initialization);
            visitAST(((ForLoop) astNode).expression);
            while(i < ((ForLoop) astNode).body.size()){
                visitAST(((ForLoop) astNode).body.get(i));
                i++;
            }
            return new ForLoop(((ForLoop) astNode).condition, ((ForLoop) astNode).initialization, ((ForLoop) astNode).expression, ((ForLoop) astNode).body);
        }

        return null;

    }

    public boolean visitExpression(AstNode left, AstNode right){
        if (left instanceof IntType && right instanceof IntType){
            return true;
        }else return left instanceof DoubleType && right instanceof DoubleType;
    }
    public boolean visitDeclaration(String type, String id, AstNode value){
        Variables.put(id, value);
        if (type.equals("int") && value instanceof IntType){
            System.out.println("hello int");

            System.out.println(Integer.parseInt(Variables.get(id).toString()));
            return true;
        }else if(type.equals("double") && value instanceof DoubleType){
            System.out.println("hello double");
            System.out.println(Double.parseDouble(Variables.get(id).toString()));
            return true;
        }else if(type.equals("txt") && value instanceof TxtType){
            System.out.println("hello txt");
            return true;
        }else if(type.equals("bool")){
            System.out.println("hello bool");
            return true;
        }
        //LAv typechecking og scopechecking
        return false;
    }

    public boolean visitAssign(String id, AstNode value){


        return false;
    }
    public dAstNode visitFunctionDefinition(String FunctionType , String FunctionId, List <AstNode> parameter, List <AstNode> body){
        return new dAstNodes.FunctionDefinition(FunctionType, FunctionId, parameter, body);
    }

}
