package Atom;

/**
 *
 * @author Miki
 */
public class Atom {

    protected String atom;

    public Atom(String atom) {
        this.atom = atom;
    }

    protected boolean isInArray(String[] array) {
        for (String item : array) {
            if (item.equals(atom)) {
                return true;
            }
        }
        return false;

    }
}
