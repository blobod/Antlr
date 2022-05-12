package Expression;

public class Print extends Expression {
    public Expression body;

    public Print(Expression body){
        this.body = body;
    }

    @Override
    public String toString(){

        return "print-statement " + body;
    }
}
