package Expression;

public class Number extends Expression {
    public int num;

    public Number(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return Integer.toString(num);
    }




}
