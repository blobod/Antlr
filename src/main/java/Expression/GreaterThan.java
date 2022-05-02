package Expression;

public class GreaterThan extends Expression{

    public Expression left;
    public Expression right;

    public GreaterThan(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }



    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}

