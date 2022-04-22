package AST;

public abstract class Division extends Expression{

    public Division(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitDivision(this);
    }


}
