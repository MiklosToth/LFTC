package Atom;


/**
 *
 * @author Miki
 */
public class Delimitator extends Atom{
    public static String delimitator[] = {";",",",".",":",".."};

    public Delimitator(String atom) {
        super(atom);
                
    }
    
    
    
    public boolean isDelimitator(String s){
        return this.isInArray(delimitator);
    }

}
