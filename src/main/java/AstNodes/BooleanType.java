package AstNodes;

public class BooleanType extends AstNode{
    public boolean bool;

    public BooleanType(boolean bool){
        this.bool = bool;
    }


    public String toString(){
        return Boolean.toString(bool);
    }
}
