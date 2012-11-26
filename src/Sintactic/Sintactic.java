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
        if (atoms.get(position).toString().equals("const")) {
            listaDeclConst();
        }
        
        return true;
    }

    private boolean sectiuneVar() {
       if (atoms.get(position).toString().equals("var")) {
            listaDeclVar();
        }
        
        return true;
    }

    private boolean sectiuneDeclSubprogram() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean instructiuniComp() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean listaDeclConst() {
        if(declarConst()) {
            return true;
        }
        listaDeclConst();
    }

    private void listaDeclVar() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private boolean declarConst() {
        int aux = position;
        
        if(!(atoms.get(aux++).getClass().equals("Identificator"))) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals("="))) {
            return false;
        }
        if(!expresieStatica(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        
        return expresieStatica(aux);
        
    }

    private boolean expresieStatica(int aux) {
        if(termenStatic(aux)) {
            return true;
        }
        expresieStatica(aux);
        opAd(aux);
        termenStatic(aux);
        
        return true;
    }

    private boolean termenStatic(int aux) {
        if(factorStatic(aux)) {
            return true;
        }
        
        termenStatic(aux);
        opMul(aux);
        factorStatic(aux);
        
        return true;
    }

    private boolean opAd(int aux) {
        if(!(atoms.get(aux).toString().equals("+"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("-"))) {
            return false;
        }
        
        return true;
    }

    private boolean factorStatic(int aux) {
        if(atoms.get(aux).getClass().equals("Identificator")) {
            return true;
        }
        if(constanta(aux)) {
            return true;
        }
        
        
        
    }

    private boolean opMul(int aux) {
        if(!(atoms.get(aux).toString().equals("*"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("/"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("div"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("mod"))) {
            return false;
        }
        
        return true;
    }
}
