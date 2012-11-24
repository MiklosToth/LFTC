
package Atom;

/**
 *
 * @author Miki
 */
public class Identificator {
    
    public boolean isIdentificator(String s) {
        String litera = "[A-za-z]";
        String cifra = "[0-9]";

        return s.matches(litera + "(" + litera + "|" + cifra + ")*");
    }
}
