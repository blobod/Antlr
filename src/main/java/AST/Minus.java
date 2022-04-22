package AST;

import Visitors.Visitor;

public class Minus extends Expression {
    public Minus(ASTNode left, ASTNode right) {
        super(left, right);
    }


   @Override
    public void accept(AST.Visitor v) {
        v.VisitMinus(this);
    }


}


