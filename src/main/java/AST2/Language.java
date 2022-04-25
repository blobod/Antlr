package AST2;

import java.util.ArrayList;
import java.util.List;

public class Language {
    public List<Expression> expressions;

    public Language(){
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        expressions.add(e);
    }
}
