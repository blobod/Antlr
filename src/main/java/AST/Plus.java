package AST;

import Visitors.Visitor;

public class Plus implements ASTNode {

    public ASTNode left;
    public ASTNode right;

    public Plus(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }
    //ArrayList<String > Operators;
    //ASTNode Operand;
}
