package AstNodes;

public class ReturnFunc extends AstNode{
    AstNode value;

    public ReturnFunc (AstNode value){
        this.value = value;
    }

    public String toString(){
        return "return " + value.toString();
    }
}
