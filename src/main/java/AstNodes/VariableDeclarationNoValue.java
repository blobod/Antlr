package AstNodes;

public class VariableDeclarationNoValue extends AstNode{
    public String type;
    public String id;

    public VariableDeclarationNoValue(String type, String id){
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString(){
        return "type def of " + type + " " + id + ",";
    }
}
