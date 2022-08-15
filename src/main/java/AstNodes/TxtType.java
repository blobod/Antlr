package AstNodes;

public class TxtType extends AstNode {
    public String string;

    public TxtType(String string){
        this.string = string;
    }

    @Override
    public String toString(){
        return string;
    }
}
