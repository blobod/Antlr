package AstNodes;

public class Println extends AstNode{
    public AstNode body;

    public Println(AstNode body){
        this.body = body;
    }

    @Override
    public String toString(){

        return "println " + body.toString();
    }
}
