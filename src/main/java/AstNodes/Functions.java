package AstNodes;

import java.util.List;

public class Functions extends AstNode {
    public AstNode FunctionType;
    public AstNode FunctionId;
    public List<AstNode> parameter;
    public List<AstNode> body;


    public Functions(AstNode FunctionType , AstNode FunctionId, List<AstNode> parameter, List<AstNode> body){
        this.FunctionType =  FunctionType;
        this.FunctionId = FunctionId;
        this.parameter= parameter;
        this.body = body;

    }

    @Override
    public String toString(){
        return "func" +FunctionType + " " + FunctionId + " " + parameter+ "  " + body;
    }
}