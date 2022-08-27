package AstNodes;

public class ReturnFunc extends AstNode{
    public AstNode value;

    public ReturnFunc (AstNode value){
        this.value = value;
    }

    public String toString(){
        return "return " + value.toString();
    }
}
