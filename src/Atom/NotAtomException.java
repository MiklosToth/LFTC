
package Atom;

/**
 *
 * @author Miki
 */
public class NotAtomException extends Exception {
    String exception;
    
    public NotAtomException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "NotAtomException{" + "exception=" + exception + '}';
    }
    
    

}
