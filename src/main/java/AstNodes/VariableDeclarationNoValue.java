package AstNodes;

public class VariableDeclarationNoValue extends AstNode{
    public String type;
    public String id;

    public VariableDeclarationNoValue(String type, String id){
        this.type = type;
        this.id = id;
    }
}
