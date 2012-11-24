package lftccompiler;

import Atom.Atom;
import IO.FileReader;
import java.util.Vector;

/**
 *
 * @author Miki
 */
public class LFTCCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "";
        Vector<Atom> atoms = new Vector(0);
        
        
        FileReader sourceFile = new FileReader(fileName);
        
        while(!sourceFile.EOF())
        {
            AtomFactory.handleNewChar(sourceFile.equals());
            
            if(AtomFactory.isNewAtom())
            {
                atoms.add(AtomFactory.getAtom());
            }
            
        }
        
        
    }
}
