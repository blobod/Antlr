import AST.Integer;
import AST.Plus;
import Visitors.PrettyPrinter;

public class PrettyPrinterDemo {

    public static void main(String[] args) {

        Integer a = new Integer(5);
        Integer b = new Integer(7);
        Plus plus = new Plus(a,b);

        PrettyPrinter prettyPrinter = new PrettyPrinter();
        prettyPrinter.visit(plus);

    }
}
