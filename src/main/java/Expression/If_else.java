package Expression;

import java.util.List;

public class If_else extends Expression {
    public Expression condition;
    public List<Expression> body;
    public List<Expression> Else;


    public If_else(Expression condition, java.util.List<Expression> body, List<Expression> Else) {
        this.condition = condition;
        this.body = body;
        this.Else = Else;
    }
    public String toString(){
        return "if " + condition + " then " + body + " else " + Else;
    }
}
