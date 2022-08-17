package AstNodes;

public class BooleanType extends AstNode{
    public boolean bool;

    public BooleanType(boolean bool){
        this.bool = bool;
    }


    public String toString(boolean bool){
        return java.lang.Boolean.toString(bool);
    }
}
