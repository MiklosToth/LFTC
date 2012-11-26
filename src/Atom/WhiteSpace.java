package Atom;

/**
 *
 * @author Miki
 */
public class WhiteSpace extends Atom {

    public WhiteSpace(String atom) {
        super(atom);
    }
    public static String newline = System.getProperty("line.separator");
    
    public static String whitespace[] = {" ", "\t", "\r", "\n"};
    
    
    public static boolean isWhiteSpace(String s){
        return Atom.isInArray(whitespace, s); 
    }
}
