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

    public static boolean isInArray(String[] array, String s) {
        for (String item : array) {
            if (item.equals(s)) {
                //System.out.println("\nFound " + s);
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return atom;
    }
    
    
}
