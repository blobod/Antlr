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

    @Override
    public void VisitMultiplikation(Multiplikation multiplikation){

        multiplikation.getLeft().accept(this);
        int left = res;
        multiplikation.getRight().accept(this);
        int right = res;

        res = left * right;
    }
    @Override
    public void VisitDivision(Division division){

        division.getLeft().accept(this);
        int left = res;
        division.getRight().accept(this);
        int right = res;

        res = left / right;
    }
    @Override
    public void VisitMinus(Minus minus){

        minus.getLeft().accept(this);
        int left = res;
        minus.getRight().accept(this);
        int right = res;

        res = left / right;
    }

}
