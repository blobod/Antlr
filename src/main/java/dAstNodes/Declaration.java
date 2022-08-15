package dAstNodes;

import AstNodes.AstNode;

public class Declaration extends dAstNode{
    public String type;
    public String id;
    public AstNode value;

    public Declaration(String type, String id, AstNode value){
        this.type = type;
        this.id = id;
        this.value = value;
    }
}
