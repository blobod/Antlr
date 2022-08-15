package AstNodes;

public class txt extends AstNode {
    public String string;

    public txt(String string){
        this.string = string;
    }

    @Override
    public String toString(){
        return string;
    }
}
