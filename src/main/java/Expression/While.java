package Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends Expression{
    public Expression condition;
    public List<Expression> body;

    public While(List<Expression> body, Expression condition){
        this.body = new ArrayList<>(body);
        this.condition = condition;
    }

    public void add(Expression child) {
        body.add(child);
    }

    public void get(int x){ body.get(x);}

    @Override
    public String toString(){
        return "while (" + condition + ") {"  + body + "}";
    }
}
