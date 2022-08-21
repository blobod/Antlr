package AstNodes;

import java.util.List;

public class FunctionCall extends AstNode {
    public List<AstNode> parameter;

    public FunctionCall(List<AstNode> parameter){
        this.parameter = parameter;
    }
}
