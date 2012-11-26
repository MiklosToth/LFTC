
package Atom;

/**
 *
 * @author Miki
 */
public class Identificator extends Atom {
    
    public static boolean isIdentificator(String s) {
        String litera = "[A-za-z]";
        String cifra = "[0-9]";

        return s.matches(litera + "(" + litera + "|" + cifra + ")*");
    }

    public Identificator(String atom) {
        super(atom);
    }
    
    
}
