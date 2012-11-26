
package Atom;

/**
 *
 * @author Miki
 */
public class ConstString extends Atom{

    public ConstString(String atom) {
        super(atom);
    }

    public static boolean isConstString(String s) {
        if(s.matches("\"[\\x20-\\x7F]*\"")) {
            return true;
        } else if(s.matches("\'[\\x20-\\x7F]*\'")) {
            return true;
        }
        return false;
    }
    
}
