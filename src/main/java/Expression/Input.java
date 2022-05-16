package Expression;

public class Input extends Expression{
    public Expression body;

    public Input(Expression body){
        this.body = body;
    }

    @Override
    public String toString(){
        return body.toString();
    }
}
