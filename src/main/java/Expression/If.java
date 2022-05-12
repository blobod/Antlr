package Expression;

import java.util.List;

public class If extends Expression{
    public Expression condition;
    public Expression body;

    public If(Expression condition, Expression body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "if " + condition + " then " + body;
    }
}


