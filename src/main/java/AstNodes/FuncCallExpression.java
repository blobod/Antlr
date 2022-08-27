package AstNodes;

public class FuncCallExpression extends AstNode{
    public AstNode func;

    public FuncCallExpression(AstNode func){
        this.func =func;
    }
}
