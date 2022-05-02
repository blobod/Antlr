package Expression;

public class VariableReDeclaration extends Expression{
    public String id;
    public int value;

    public VariableReDeclaration(String id, int value){
        this.id = id;
        this.value = value;
    }

}
