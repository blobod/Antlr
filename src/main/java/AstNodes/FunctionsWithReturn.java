package AstNodes;

import java.util.List;

public class FunctionsWithReturn extends AstNode {
    public String FunctionType;
    public String FunctionId;
    public List<AstNode> parameter;
    public List<AstNode> body;
    public AstNode returnValue;

    public FunctionsWithReturn(String FunctionType , String FunctionId, List<AstNode> parameter, List<AstNode> body, AstNode returnValue){
        this.FunctionType =  FunctionType;
        this.FunctionId = FunctionId;
        this.parameter= parameter;
        this.body = body;
        this.returnValue = returnValue;
    }

    @Override
    public String toString(){
        return "function " + FunctionType + " " + FunctionId + " " + parameter+ " " + body;
    }
}
