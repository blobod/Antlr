package Expression;

public class Number extends Expression {
    public Type num;

    public Number(Type num){
        this.num = num;
    }

    @Override
    public String toString(){
        return num.toString();
    }




}
