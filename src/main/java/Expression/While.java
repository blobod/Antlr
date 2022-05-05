package Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends Expression{

    public List<Expression> block;


    public While(){
        this.block = new ArrayList<>();
    }

    public void add(Expression child) {
        block.add(child);
    }

    public void get(int x){ block.get(x);}

    @Override
    public String toString(){
        return "while {"  + block + "}";
    }
}
