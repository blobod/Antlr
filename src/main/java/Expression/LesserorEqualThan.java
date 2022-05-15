package Expression;

public class LesserorEqualThan extends Expression{
    public Expression left;
    public Expression right;

    public LesserorEqualThan(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
