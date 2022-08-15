import AstNodes.*;
import AstNodes.Addition;
import dAstNodes.*;

public class ContextualDecorator {




    public dAstNode visitExpression(AstNode left, AstNode right){
        System.out.println("vi er her " + left + " and " + right);
            return new dAstNodes.Expression(left, right);
    }

    public dAstNode visitStatement(AstNode condition, AstNode body, AstNode elseBody){
        return new dAstNodes.Statement(condition, body, elseBody);
    }

    public byte typeChecking(AstNode left, AstNode right){
        Type leftT = new (Type) visit(left);
        Type rigthT = new Type(right);

    }
}
