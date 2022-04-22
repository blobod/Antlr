package AST;



public class Multiplication extends Expression{

    public Multiplication(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.VisitMultiplication(this);
    }


}
