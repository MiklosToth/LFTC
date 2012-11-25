package Atom;

/**
 *
 * @author Miki
 */
public class WhiteSpace extends Atom {

    public WhiteSpace(String atom) {
        super(atom);
    }
    public static String whitespace[] = {" ", "\t", "\n"};
    
    public boolean isWhiteSpace(){
        return this.isInArray(whitespace); 
    }
}
