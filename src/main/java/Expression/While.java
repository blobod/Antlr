package Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends Expression{
    public Expression condition;
    public List <Expression> body;

    public While(Expression condition, List<Expression> body){
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "while " + condition + " do " + body;
    }

}
