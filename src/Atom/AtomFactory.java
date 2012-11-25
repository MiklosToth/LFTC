package Atom;

import java.util.Vector;

/**
 *
 * @author Miki
 */
public class AtomFactory {

    private static String s = "";
    private static Vector<Atom> Atoms = new Vector(0);

    public static void handleNewChar(char ch) throws NotAtomException {
        Atom atom = null;

        if (WhiteSpace.isWhiteSpace(Character.toString(ch))) {
            if ((atom = newAtom()) == null) {
                throw new NotAtomException();
            }
            
            if ()

        }
    }

    public static Vector<Atom> getAtoms() {
        return Atoms;
    }

    private static Atom newAtom() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
