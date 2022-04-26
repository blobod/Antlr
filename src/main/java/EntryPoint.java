import AST2.Expression;
import AST2.Language;
import grammar.ExpressionProcessor;
import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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



        AntlrToLanguage visitor = new AntlrToLanguage();
        Language lang = visitor.visit(tree);
        if (visitor.semanticErrors.isEmpty()){
            ExpressionProcessor ep = new ExpressionProcessor(lang.expressions);
            for (String evaluation: ep.getEvaluationResults()){
                System.out.println(evaluation);
            }
        }else{
            for(String err: visitor.semanticErrors){
                System.out.println(err);
            }
        }
    }catch(IOException e){
        e.printStackTrace();
    }
    }

}
