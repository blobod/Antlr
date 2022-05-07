package Expression;

import java.util.List;

public class If extends Expression{
    public Expression condition;
    public List<Expression> body;
    public  List<Expression> elseStmt;

    public If(Expression condition, java.util.List<Expression> body, java.util.List<Expression> elseStmt) {
        this.condition = condition;
        this.body = body;

        if (elseStmt!= null){
            this.elseStmt = elseStmt;
        }
    }
}


