package Expression;

import java.util.ArrayList;

public class Forever_Loop extends Expression{
    public Expression beginning;
    public Expression block;
    public Expression end;

    public Forever_Loop(Expression beginning, Expression block, Expression end){
        this.beginning = beginning;
        this.block = block;
        this.end = end;
    }

    @Override
    public String toString(){
        return "forever: " + beginning + block + end;
    }
}
