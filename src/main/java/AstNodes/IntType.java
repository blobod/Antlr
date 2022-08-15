package AstNodes;

public class IntType extends AstNode {
    public int num;

    public IntType(int num){
        this.num = num;
    }


    public String toString(){
        return java.lang.Integer.toString(num);
    }




}
