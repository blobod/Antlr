package Expression;

public class isNotEqualWith extends Expression {
    public Expression left;
    public Expression right;

    public isNotEqualWith(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
