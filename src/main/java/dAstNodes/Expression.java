package dAstNodes;

import AstNodes.AstNode;

public class Expression extends dAstNode {
    public boolean typeCheck;
    public Expression(boolean typeCheck){
    this.typeCheck = typeCheck;
    }

}
