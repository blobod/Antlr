package Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends Expression{
    public Expression condition;
    public Expression body;

    public While(Expression condition, Expression body){
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString(){
        return "while " + condition + " do " + body;
    }

}
