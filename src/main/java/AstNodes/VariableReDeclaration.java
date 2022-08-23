package AstNodes;

public class VariableReDeclaration extends AstNode {
    public String id;
    public AstNode value;
    public boolean typeChecking;
    public VariableReDeclaration(String id, AstNode value, boolean typeChecking){
        this.id = id;
        this.value = value;
        this.typeChecking = typeChecking;
    }

    @Override
    public String toString(){
        return id.toString() + " " + value.toString();
    }

}
