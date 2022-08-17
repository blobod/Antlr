package AstNodes;

public class VariableReDeclaration extends AstNode {
    public String id;
    public AstNode expression;
    public boolean typeChecking;
    public VariableReDeclaration(String id, AstNode expression, boolean typeChecking){
        this.id = id;
        this.expression = expression;
        this.typeChecking = typeChecking;
    }

    @Override
    public String toString(){
        return id.toString() + " " + expression.toString();
    }

}
