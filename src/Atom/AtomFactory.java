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
            if(CuvantCheie.isCuvantCheie(s)){
                atom = new CuvantCheie(s);
            } else if (ConstNum.isConstNum(s)) {
                atom = new ConstNum(s);
                
            } else if(ConstString.isConstString(s)){
                atom = new ConstString(s);
            } else if(Delimitator.isDelimitator(s)){
                atom = new Delimitator(s);
            } else if(Operator.isOperator(s)){
                atom = new Operator(s);
            } else if(Identificator.isIdentificator(s)){
                atom = new Identificator(s);
            } else if(atom == null){
                throw new NotAtomException(Character.toString(ch) + ";");
            }
            
            atoms.add(atom);
            //System.out.println(s);
            s = "";
            
        }
        else{
            s += ch;
        }
    }

    public static Vector<Atom> getAtoms() {
        return atoms;
    }

}
