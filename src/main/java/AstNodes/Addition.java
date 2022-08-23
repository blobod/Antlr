package AstNodes;

public class Addition extends AstNode {
    public AstNode left;
    public AstNode right;
    public boolean typeCheck;

    public Addition(AstNode left, AstNode right, boolean typeCheck){
        this.left = left;
        this.right = right;
        this.typeCheck = typeCheck;
    }

    public String toString(){
        return "print " +  left.toString() + " " + right.toString();
    }



    public int getLeft(){return java.lang.Integer.parseInt(left.toString());}
    public AstNode getRight(){return right;}

}
