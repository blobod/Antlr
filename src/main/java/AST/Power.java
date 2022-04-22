package AST;

public class Power extends Expression {

        public Power(ASTNode left, ASTNode right) {
            super(left, right);
        }

        @Override
        public void accept(Visitor v) {
            v.VisitPower(this);
        }




}
