import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class EntryPoint {
    public static void main(String[] args){
    try{
        String source = "test.txt";
        CharStream cs = fromFileName(source);
        languageLexer lexer = new languageLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        languageParser parser = new languageParser(token);

        ParseTree tree = parser.language();

        AntlrToAST visitor = new AntlrToAST();
        visitor.visit(tree);
    }catch(IOException e){
        e.printStackTrace();
    }
    }

}
