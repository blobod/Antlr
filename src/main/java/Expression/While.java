package Expression;

import java.util.List;

public class While extends Expression{

    public List<Expression> body;
    public Expression condition;

    public While (Expression condition, List<Expression> body) {
        this.condition = condition;
        this.body = body;

    }



    @Override
    public String toString(){
        return "while (" + condition + ") {"  + body + "}";
    }
}
