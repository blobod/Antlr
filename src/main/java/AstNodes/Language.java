package AstNodes;

import java.util.List;

public class Language extends AstNode{
    public List<AstNode> body;

    public Language(List<AstNode> body){
        this.body = body;
    }

    public String toString(){
        return body.toString();
    }
}
