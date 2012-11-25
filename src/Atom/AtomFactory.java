package Atom;

import java.util.Vector;

/**
 *
 * @author Miki
 */
public class AtomFactory {

    private static String s = "";
    private static Vector<Atom> atoms = new Vector(0);

    public static void handleNewChar(char ch) throws NotAtomException {
        Atom atom = null;

        if (WhiteSpace.isWhiteSpace(Character.toString(ch))) {

            if (ConstNum.isConstNum(s)) {
                atom = new ConstNum(s);
                
            }
            if(ConstString.isConstString(s)){
                atom = new ConstString(s);
            }
            if(CuvantCheie.isCuvantCheie(s)){
                atom = new CuvantCheie(s);
            }
            if(Delimitator.isDelimitator(s)){
                atom = new Delimitator(s);
            }
            if(Operator.isOperator(s)){
                atom = new Operator(s);
            }
            
            if(atom == null){
                throw new NotAtomException(Character.toString(ch) + ";");
            }
            
            atoms.add(atom);
            
        }
        else{
            s += ch;
        }
    }

    public static Vector<Atom> getAtoms() {
        return atoms;
    }

}
