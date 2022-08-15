package dAstNodes;

import AstNodes.AstNode;

public class Value extends dAstNode{
    AstNode value;

    public Value(AstNode value){
        this.value = value;
    }
}
