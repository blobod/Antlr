package AST;

public interface Visitor {

    void VisitPlus(Plus plus);

    void VisitMinus(Minus minus);

    void VisitMultiplication(Multiplication multiplication);
    void VisitDivision(Division division);
    void VisitPower(Power power);




}
