package AST;

public interface Visitor {

    void VisitPlus(Plus plus);

    void VisitMultiplikation(Multiplikation multiplikation);

    void VisitDivision(Division division);

    void VisitMinus(Minus minus);

}
