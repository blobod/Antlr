package Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends Expression{
    public Expression condition;
    public List<Expression> body;

    public While(Expression condition, List<Expression> body){
        this.condition = condition;
        this.body = new ArrayList<>(body);
    }

    public void add(Expression child) {
        body.add(child);
    }

    public void get(int x){ body.get(x);}

}
