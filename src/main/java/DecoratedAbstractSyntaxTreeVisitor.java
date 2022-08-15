
import AstNodes.*;
import dAstNodes.dAstNode;

public class DecoratedAbstractSyntaxTreeVisitor {

    public dAstNode visitAST(AstNode astNode) {
            AstNode ast =

            if (AstNode instanceof AstNodes.Addition){
                return visitExpression(((Addition) e).left, ((Addition) e).right);
            }else if(e instanceof AstNodes.Substraktion){
                return visitExpression(((Substraktion) e).left, ((Substraktion) e).right);
            }else if(e instanceof AstNodes.Multiplication){
                return visitExpression(((Multiplication) e).left, ((Multiplication) e).right);
            }else if(e instanceof AstNodes.Division){
                return visitExpression(((Division) e).left, ((Division) e).right);
            }else if(e instanceof AstNodes.Print){
                return visitStatement(null, ((Print) e).body, null);
            }else if(e instanceof AstNodes.While){

            }
            return null;

    }

}
