
import AstNodes.*;
import dAstNodes.dAstNode;

import java.util.List;

public class DecoratedAbstractSyntaxTreeVisitor {

    public dAstNode visitAST(AstNode astNode) {
        if (astNode instanceof Addition){
                return visitExpression(((Addition) astNode).left, ((Addition) astNode).right);
            }
        else if(astNode instanceof Substraktion){
                return visitExpression(((Substraktion) astNode).left, ((Substraktion) astNode).right);
            }
        else if(astNode instanceof Multiplication){
                return visitExpression(((Multiplication) astNode).left, ((Multiplication) astNode).right);
            }
        else if(astNode instanceof Division){
                return visitExpression(((Division) astNode).left, ((Division) astNode).right);
            }
        else if(astNode instanceof GreaterThan){
            return visitExpression(((GreaterThan) astNode).left, ((GreaterThan) astNode).right);
        }
        else if(astNode instanceof LesserThan){
            return visitExpression(((LesserThan) astNode).left, ((LesserThan) astNode).right);
        }
        else if(astNode instanceof GreaterorEqualThan){
            return visitExpression(((GreaterorEqualThan) astNode).left, ((GreaterorEqualThan) astNode).right);
        }
        else if(astNode instanceof LesserorEqualThan){
            return visitExpression(((LesserorEqualThan) astNode).left, ((LesserorEqualThan) astNode).right);
        }
        else if(astNode instanceof EqualWith){
            return visitExpression(((EqualWith) astNode).left, ((EqualWith) astNode).right);
        }
        else if(astNode instanceof isNotEqualWith){
            return visitExpression(((isNotEqualWith) astNode).left, ((isNotEqualWith) astNode).right);
        }
        else if(astNode instanceof VariableDeclaration){
            return visitDeclaration(((VariableDeclaration) astNode).type, ((VariableDeclaration) astNode).id, ((VariableDeclaration) astNode).value);
        }
        else if(astNode instanceof VariableReDeclaration){
            return visitDeclaration(null, ((VariableReDeclaration) astNode).id, ((VariableReDeclaration) astNode).astNode);
        }
        else if(astNode instanceof If){
            int i = 0;
            visitAST(((If) astNode).condition);
            while(i <((If) astNode).body.size()){
                visitAST(((If) astNode).body.get(i));
                i++;
            }
        }
        else if(astNode instanceof If_else){
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
        }
        else if(astNode instanceof Forever_Loop) {
            int i = 0;
            while (i < ((Forever_Loop) astNode).body.size()) {
                visitAST(((Forever_Loop) astNode).body.get(i));
                i++;
            }
        }
        else if(astNode instanceof Print){
                visitAST(((Print) astNode).body);
            }
        else if(astNode instanceof While){
            visitAST(((While) astNode).condition);
            int i = 0;
            while(i <((While) astNode).body.size()){
                visitAST(((While) astNode).body.get(i));
                i++;
            }
        }else if(astNode instanceof Language){
            int i = 0;
            while(i < ((Language) astNode).body.size()){
                visitAST(((Language) astNode).body.get(i));
                i++;
            }
        }else if(astNode instanceof Functions){
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
            int i = 0;
            visitAST(((ForLoop) astNode).condition);
            visitAST(((ForLoop) astNode).initialization);
            visitAST(((ForLoop) astNode).expression);
            while(i < ((ForLoop) astNode).body.size()){
                visitAST(((ForLoop) astNode).body.get(i));
                i++;
            }
        }

        return null;

    }

    public dAstNode visitExpression(AstNode left, AstNode right){
        return new dAstNodes.Expression(left, right);
    }
    public dAstNode visitDeclaration(String type, String id, AstNode value){
        return new dAstNodes.Declaration(type, id, value);
    }
    public dAstNode visitFunctionDefinition(String FunctionType , String FunctionId, List <AstNode> parameter, List <AstNode> body){
        return new dAstNodes.FunctionDefinition(FunctionType, FunctionId, parameter, body);
    }

}
