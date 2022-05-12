package Expression;

public class VariableReDeclaration extends Expression{
    public String id;
    public Expression expression;

    public VariableReDeclaration(String id, Expression expression){
        this.id = id;
        this.expression = expression;
    }

    @Override
    public String toString(){
        return expression.toString();
    }

}
