package Atom;

/**
 *
 * @author Miki
 */
public class CuvantCheie extends Atom{

    String cuvCheie[] = {"and", "begin", "case", "char", "const", "div", "do",
        "downto", "else", "end", "for", "function", "if",
        "integer", "mod", "not", "of", "or", "procedure",
        "program", "real", "repeat", "then", "until", "var", "while"};
    
    public boolean isCuvCheie(String s) {
        for (String c : cuvCheie) {
            if(c.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
