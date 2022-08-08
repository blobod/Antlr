import AstNodes.SyntaxAnalysis;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.List;

public class CstToLanguageAst extends languageBaseVisitor<SyntaxAnalysis> {
    @Override public SyntaxAnalysis visitLanguage(languageParser.LanguageContext ctx) {
       SyntaxAnalysis astnodes = new SyntaxAnalysis();

       CstToAst astVisitor = new CstToAst();
       for (int i = 0; i < ctx.getChild(0).getChildCount(); i++){
            if (i == ctx.getChild(0).getChildCount()){
                System.out.println("\n EOF");
            }
            else{
                astnodes.addAst(astVisitor.visit(ctx.getChild(0).getChild(i)));
            }

        }

       return astnodes;
    }
}
