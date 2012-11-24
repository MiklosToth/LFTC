package Atom;


/**
 *
 * @author Miki
 */
public class Delimitator extends Atom{
    String delimitator[] = {";",",",".",":",".."};
    
    public boolean isDelimitator(String s){
        for (String d : delimitator) {
            if(d.equals(s)) {
                return true;
            }
        }
        return false;
    }

}
