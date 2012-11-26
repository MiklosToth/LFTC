package lftccompiler;

import Atom.Atom;
import Atom.AtomFactory;
import Atom.NotAtomException;
import IO.EOF;
import IO.ReadFile;
import Sintactic.Sintactic;
import java.io.IOException;
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
        String fileName = "source.txt";
        Vector<Atom> atoms = new Vector(0);


        ReadFile sourceFile = new ReadFile("C:/Users/Miki/Documents/NetBeansProjects/LFTCCompiler/src/lftccompiler/" + fileName);

        while (true) {

            try {
                try {
                    char ch = sourceFile.get();
                    //System.out.print(ch);
                    AtomFactory.handleNewChar(ch);

                } catch (NotAtomException ex) {
                    //System.err.println(ex);
                }
            } catch (IOException | EOF ex) {
                break;
            }

        }

        atoms = AtomFactory.getAtoms();
        int i = 0;
//        
//        atoms.add(new CuvantCheie("program"));
//        atoms.add(new Identificator("bla"));
//        
        for (Atom atom : atoms) {
            System.out.println("(" + i++ + ")" + atom.getClass() + ":" + atom);
        }
        
        
        if(Sintactic.verify(atoms)==false){
            System.out.println("Sintax is bad");
            System.exit(-1);
        }
        
        System.out.println("Sintax OK");
        
        

    }
}
