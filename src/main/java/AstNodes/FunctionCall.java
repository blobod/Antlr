package AstNodes;

import java.util.List;

public class FunctionCall extends AstNode {
    public String functionID;
    public List<AstNode> parameter;

    public FunctionCall(List<AstNode> parameter, String functionID){
        this.functionID = functionID;
        this.parameter = parameter;
    }

    public String toString(){
        return functionID + " (" + parameter + ") ";
    }
}
