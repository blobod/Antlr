package dAstNodes;

import AstNodes.AstNode;

public class Addition extends dAstNode {
    public AstNode left;
    public AstNode right;

    public Addition(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return "hello";
    }
}
