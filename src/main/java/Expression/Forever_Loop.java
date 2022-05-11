package Expression;

import java.util.ArrayList;
import java.util.List;

public class Forever_Loop extends Expression{
    public Expression beginning;
    public List<Expression> block;
    public Expression end;

    public Forever_Loop(){
        this.block = new ArrayList<>();
    }

    public void add(Expression child) {
        block.add(child);
    }

    public void get(int x){ block.get(x);}

    @Override
    public String toString(){
        return "forever: {"  + block + "}";
    }
}