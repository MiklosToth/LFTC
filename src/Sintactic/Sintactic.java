
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
    
    
    
    public boolean verify(){
        LinkedHashMap<String, String> programTemplate = new LinkedHashMap<>();
        programTemplate.put("CuvantCheie", "program");
        programTemplate.put("Identificator", "");
        programTemplate.put("functie", "block");
        
        return checkTemplate(programTemplate);
    }

    private boolean checkTemplate(LinkedHashMap<String, String> programTemplate) {
        Object[] keys = programTemplate.keySet().toArray();
        
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
//            if(keys[i].equals("functie")){
//                //apeleaza functia din hash
//            }
//            
            if(atoms.get(i).getClass().toString().equals(keys[i])){
                //verifica daca in hash e "" ->>>continue
                if(programTemplate.get(keys[i]))
                //verifica daca in hash e ce e in atomi
            }
        }
        
        
        return true;
    }

}
