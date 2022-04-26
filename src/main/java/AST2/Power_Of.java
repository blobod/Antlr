package AST2;

public class Power_Of extends Expression{
    Expression left;
    Expression right;

    public Power_Of(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " ^ " + right.toString();
    }
}
