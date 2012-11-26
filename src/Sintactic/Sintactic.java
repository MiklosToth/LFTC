package Sintactic;

import Atom.Atom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Vector;

/**
 *
 * @author Miki
 */
public class Sintactic {

    private Vector<Atom> atoms;

    public Sintactic(Vector<Atom> atoms) {
        this.atoms = atoms;
    }

    public boolean verify() {
        return program();

    }

    private boolean program() {
        if (!(atoms.get(0).toString().equals("program"))) {
            return false;
        }
        if (!(atoms.get(1).getClass().toString().equals("Identificator"))) {
            return false;
        }
        
        return block();
        
        
        
    }

    private boolean block() {
        if(!(sectiuneConst())){
            return false;
        }
        if(!(sectiuneVar())){
            return false;
        }
        if(!(sectiuneDeclSubprogram())){
            return false;
        }
        if(!(instructiuniComp())){
            return false;
        }
        
        return true;
    }

    private boolean sectiuneConst() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean sectiuneVar() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean sectiuneDeclSubprogram() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean instructiuniComp() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
