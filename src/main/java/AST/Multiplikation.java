package AST;

public abstract class Multiplikation extends Expression{

        public Multiplikation(ASTNode left, ASTNode right) {
            super(left, right);
        }

        @Override
        public void accept(Visitor v) {
            v.VisitMultiplikation(this);
        }


}
