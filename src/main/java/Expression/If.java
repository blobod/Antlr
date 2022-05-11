package Expression;

import java.util.List;

public class If extends Expression{
    public Expression condition;
    public List<Expression> body;

    public If(Expression condition, java.util.List<Expression> body) {
        this.condition = condition;
        this.body = body;
    }
}


