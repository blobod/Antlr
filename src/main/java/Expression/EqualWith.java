package Expression;

public class EqualWith extends Expression {
    public Expression left;
    public Expression right;

    public EqualWith(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
