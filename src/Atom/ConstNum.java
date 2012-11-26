
package Atom;

/**
 *
 * @author Miki
 */
public class ConstNum extends Atom{

    public ConstNum(String atom) {
        super(atom);
    }
    
    public static boolean isConstNum(String s) {
        boolean intreg = true;
        boolean real = true;
        
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException numberFormatException) {
            intreg = false;
        }
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException numberFormatException) {
            real = false;
        }
                
        return intreg||real;
    }
            
}
