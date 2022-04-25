import AST2.Expression;
import AST2.Language;
import grammar.languageBaseVisitor;
import grammar.languageParser;

public class AntlrToLanguage extends languageBaseVisitor<Language> {
    @Override public Language visitLanguage(languageParser.LanguageContext ctx) { return visitChildren(ctx); }
}
