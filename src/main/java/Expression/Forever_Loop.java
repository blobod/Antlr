package Expression;

import java.util.ArrayList;
import java.util.List;

public class Forever_Loop extends Expression{
    public List<Expression> body;

    public Forever_Loop(List<Expression> body){
        this.body = body;
    }

    @Override
    public String toString(){
        return "forever: {"  + body + "}";
    }
}
