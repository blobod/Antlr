package Expression;

public class GreaterorEqualThan extends Expression{
    public Expression left;
    public Expression right;

    public GreaterorEqualThan(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
