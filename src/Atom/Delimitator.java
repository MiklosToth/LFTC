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
    
    
    
    public static boolean isDelimitator(String s){
        return Atom.isInArray(delimitator, s);
    }

}
