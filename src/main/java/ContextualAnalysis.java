import dAstNodes.dAstNode;

import java.util.ArrayList;
import java.util.List;

public class ContextualAnalysis {
    public List<dAstNode> dAstNodes;


    public ContextualAnalysis(){
        this.dAstNodes = new ArrayList<>();
    }

    public void addDast(dAstNode e){
        dAstNodes.add(e);
    }

    public List<dAstNode> getdAstNodes(){return dAstNodes;}

    public String toString(){
         return dAstNodes.get(0).toString();
    }
}
