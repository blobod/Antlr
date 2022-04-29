package Expression;

public class Condition extends Expression{
    public Expression left;
    public Expression right;
    public Expression operator;



    public Condition(Expression left, Expression right, Expression operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString(){
        return "condition: " + left + operator + right;
    }
}
