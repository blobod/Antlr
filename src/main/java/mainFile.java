import AstNodes.SyntaxAnalysis;
import grammar.Interpreter;
import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class mainFile {
    public static void main(String[] args) {
        try {
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            languageLexer lexer = new languageLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            languageParser parser = new languageParser(token);
            ParseTree tree = parser.language();

            CstToLanguageAst visitor = new CstToLanguageAst();
            SyntaxAnalysis ast = visitor.visit(tree);

            AstToDast decorator = new AstToDast();

            ContextualAnalysis dast = decorator.visitAST(ast);

            System.out.println(dast.getdAstNodes().get(0).toString());


                Interpreter ep = new Interpreter(ast.astNodes);
                System.out.println(ep.getEvaluationResults());
                for (String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                }
            } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
