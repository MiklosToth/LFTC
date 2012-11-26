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
    private int position;

    public Sintactic(Vector<Atom> atoms) {
        this.atoms = atoms;
        position = 0;
    }

    public boolean verify() {
        return program();

    }

    private boolean program() {
        if (!(atoms.get(position++).toString().equals("program"))) {
            return false;
        }
        if (!(atoms.get(position++).getClass().toString().equals("Identificator"))) {
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
