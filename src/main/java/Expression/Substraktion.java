package Expression;

public class Substraktion extends Expression {
    public Expression left;
    public Expression right;

    public Substraktion(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " - " + right.toString();
    }
}
