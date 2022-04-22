package AST;
import AST.Visitor;
public class Calculator implements Visitor {


    int res = 0;

    @Override
    public void VisitPlus(Plus plus){

    plus.getLeft().accept(this);
    int left = res;
    plus.getRight().accept(this);
    int right = res;

    res = left + right;



    }



}
