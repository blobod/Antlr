package Expression;

import java.util.List;

public class If extends Expression{
    public Expression condition;
    public List <Expression> body;

    public If(Expression condition, List<Expression> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "if " + condition + " then " + body;
    }
}


