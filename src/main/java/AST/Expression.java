package AST;

import Visitors.Visitor;

public abstract class Expression implements ASTNode<Object> {
    ASTNode left;
    ASTNode right;

    public Expression(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }


    public ASTNode getLeft() {
        return left;
    }

    public ASTNode getRight() {
        return right;
    }

}