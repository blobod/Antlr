import AST.IntegerNode;
import AST.Minus;
import AST.Plus;
import Visitors.PrettyPrinter;

public class PrettyPrinterDemo {

    public static void main(String[] args) {

        IntegerNode a = new IntegerNode(5);
        IntegerNode b = new IntegerNode(7);
        IntegerNode c = new IntegerNode(9);


        Plus plus = new Plus(a,b);

        PrettyPrinter prettyPrinter = new PrettyPrinter();
        prettyPrinter.visit(plus);



        Minus minus = new Minus(plus,c);
        prettyPrinter.visit(minus);




    }
}
