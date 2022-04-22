package AST;

import AST.Visitor;

public class Plus extends Expression {
    public Plus(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor v) {
       v.VisitPlus(this);
    }


}
