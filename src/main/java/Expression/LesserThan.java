package Expression;

public class LesserThan extends Expression{
    public Expression left;
    public Expression right;

    public LesserThan(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
