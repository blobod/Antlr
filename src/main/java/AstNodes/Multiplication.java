package AstNodes;

public class Multiplication extends AstNode {
    public AstNode left;
    public AstNode right;
    public boolean typeChecking;
    public Multiplication(AstNode left, AstNode right, boolean typeChecking){
        this.left = left;
        this.right = right;
        this.typeChecking = typeChecking;
    }

    @Override
    public String toString(){

        return left.toString() + " * " + right.toString();
    }
}
