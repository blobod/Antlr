package AST2;

public class Variable extends Expression{

    public String id;

    public Variable(String id){
        this.id = id;
    }

    public String toString(){
        return id;
    }
}
