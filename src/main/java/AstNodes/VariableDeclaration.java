package AstNodes;


public class VariableDeclaration extends AstNode {
    public String id;
    public String type;
    public AstNode value;
    public boolean typeChecking;


    public VariableDeclaration(String id, String type, AstNode value, boolean typeChecking){
        this.id = id;
        this.type = type;
        this.value = value;
        this.typeChecking = typeChecking;
    }

    @Override
    public String toString(){
        return "type def of " + type + " id " + id + " value " + value;
    }
}

