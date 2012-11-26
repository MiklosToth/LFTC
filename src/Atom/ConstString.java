
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
        
        return s.matches("\"|\'[\\x20-\\x7F]\"|\'");
    }
    
}
