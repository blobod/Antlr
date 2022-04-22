package AST;

import Visitors.Visitor;

public abstract class Expression implements ASTNode<Object> {
    ASTNode left;
    ASTNode right;

    public Expression(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }

}