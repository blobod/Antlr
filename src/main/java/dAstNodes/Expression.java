package dAstNodes;

import AstNodes.AstNode;

public class Expression extends dAstNode {
    public AstNode left;
    public AstNode right;

    public Expression(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

}
