package AstNodes;

public class Double extends AstNode{
    public double doub;

    public Double(int doub){
        this.doub = doub;
    }


    public String toString(double doub){
        return java.lang.Double.toString(doub);
    }
}
