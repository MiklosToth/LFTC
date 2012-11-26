
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
    
    public boolean bloc(){
      
        String[] keys = {"functie", "functie", "functie", "functie"};
        String[] content = {"sectiuneConst", "sectiuneVar", "sectiuneDeclSubprog", "instrComp"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean sectiuneConst(){
     
        String[] keys = {"WhiteSpace", "CuvantCheie", "functie"};
        String[] content = {"", "const", "listaDeclConst"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean listaDeclConst(){
        
        String[] keys = {"functie"};
        String[] content = {"declarConst"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean sectiuneVar(){
        
        String[] keys = {"WhiteSpace", "CuvantCheie", "functie"};
        String[] content = {"", "var", "listaDeclVar"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean listaDeclVar(){
        
        String[] keys = {"functie"};
        String[] content = {"declarVar"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean sectiuneDeclSubprog(){
        
        String[] keys = {"WhiteSpace", "functie"};
        String[] content = {"", "listaDeclSubprog"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean listaDeclSubprog(){
        
        String[] keys = {"functie"};
        String[] content = {"declSubprog"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean declSubprog(){
        
        String[] keys = {"functie", "functie"};
        String[] content = {"declarFunctie", "declarProcedura"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean declConst(){
        
        String[] keys = {"Identificator", "Operator", "functie", "Delimitator"};
        String[] content = {"", "=", "expresieStatica", ";"};
        
        return checkTemplate(keys, content);
    }
    
    public boolean declVar(){
        
        String[] keys = {"functie", "Delimitator", "functie", "Delimitator"};
        String[] content = {"listaId", ":", "tip", ";"};
        
        return checkTemplate(keys, content);
    }
    
     public boolean listaId(){
        
        String[] keys = {"Identificator"};
        String[] content = {""};
        
        return checkTemplate(keys, content);
    }
    
    
    private boolean checkTemplate(LinkedHashMap<String, String> template) {
        Object[] keys = template.keySet().toArray();
        
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
//            if(keys[i].equals("functie")){
//                //apeleaza functia din hash
//            }
//            
            if(atoms.get(i).getClass().toString().equals(keys[i])){
                //verifica daca in hash e "" ->>>continue
                if(template.get(keys[i]))
                //verifica daca in hash e ce e in atomi
            }
        }
        
        
        return true;
    }

}
