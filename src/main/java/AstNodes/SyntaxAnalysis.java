package AstNodes;

import java.util.ArrayList;
import java.util.List;

public class SyntaxAnalysis {
    public List<AstNode> astNodes;


    public SyntaxAnalysis(){
        this.astNodes = new ArrayList<>();
    }

    public void addAst(AstNode e){
        astNodes.add(e);
    }

    public int getSize(){return astNodes.size();}

    public List<AstNode> getAstNodes(){return astNodes;}
}
