package Expression;

public class Print {
    public Expression print;

    public Print(Expression print){
        this.print = print;
    }

    @Override
    public String toString(){

        return "print-statement " + print;
    }
}
