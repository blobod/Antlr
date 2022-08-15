package AstNodes;

public class DoubleType extends AstNode{
    public double doub;

    public DoubleType(double doub){
        this.doub = doub;
    }


    public String toString(double doub){
        return java.lang.Double.toString(doub);
    }
}
