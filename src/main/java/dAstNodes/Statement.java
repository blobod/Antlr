package dAstNodes;

import AstNodes.AstNode;

public class Statement extends dAstNode{
    public AstNode condition;
    public AstNode body;
    public AstNode elseBody;
    public Statement(AstNode condition, AstNode body, AstNode elseBody){
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
    }

    public String toString(){
        return "hello";
    }
}
