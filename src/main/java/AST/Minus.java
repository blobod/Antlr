package AST;

public class Minus extends Expression {
    public Minus(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitMinus(this);
    }

}


