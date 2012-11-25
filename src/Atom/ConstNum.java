
package Atom;

/**
 *
 * @author Miki
 */
public class ConstNum extends Atom{

    public ConstNum(String atom) {
        super(atom);
    }
    
    public boolean isConstNum(String s) {
        boolean intreg = true;
        boolean real = true;
        
        try {
            Integer.parseInt(s);
            return intreg;
        } catch (NumberFormatException numberFormatException) {
            intreg = false;
        }
        try {
            Double.parseDouble(s);
            return real;
        } catch (NumberFormatException numberFormatException) {
            real = false;
        }
                
        return false;
    }
            
}
