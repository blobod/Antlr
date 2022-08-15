package AstNodes;

import java.util.List;

public class ForLoop extends AstNode{
    public AstNode condition;
    public AstNode initialization;
    public AstNode expression;
    public List<AstNode> body;


    public ForLoop(AstNode initialization, AstNode condition, AstNode expression, List<AstNode> body){
        this.condition = condition;
        this.initialization = initialization;
        this.expression = expression;
        this.body = body;

    }

    @Override
    public String toString(){
        return "for" + initialization+ " " + condition + " " + expression+ " do " + body;
    }
}