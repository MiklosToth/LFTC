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

        String[] keys = {"CuvantCheie", "Identificator", "functie"};
        String[] content = {"program", "", "block"};

        return true;
        //return checkTemplate(keys, content);
    }

    private boolean checkTemplate(String[] keys, String[] content) {

        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
            if (keys[i].equals("functie")) {
                //apeleaza functia din hash
                //System.out.println("functie");
                continue;
            }

            if (keys[i].equals(atoms.get(i).getClass().toString())) {
                if (content[i].equals("")) {
                    continue;
                }

                if (atoms.get(i).toString().equals(content[i])) {
                    continue;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }

        return true;
    }
}
