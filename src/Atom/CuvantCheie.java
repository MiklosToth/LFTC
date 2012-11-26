package Atom;

/**
 *
 * @author Miki
 */
public class CuvantCheie extends Atom {

    public static String cuvCheie[] = {"and", "begin", "case", "char", "const", "div", "do",
        "downto", "else", "end", "for", "function", "if",
        "integer", "mod", "not", "of", "or", "procedure",
        "program", "real", "repeat", "then", "until", "var", "while"};

    public CuvantCheie(String atom) {
        super(atom);
        
        
    }

    public static boolean isCuvantCheie(String s) {
        return Atom.isInArray(cuvCheie, s);
    }
}
