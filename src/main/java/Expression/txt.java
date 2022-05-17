package Expression;

public class txt extends Expression{
    public Type string;

    public txt(Type string){
        this.string = string;
    }

    @Override
    public String toString(){
        return string.toString();
    }
}
