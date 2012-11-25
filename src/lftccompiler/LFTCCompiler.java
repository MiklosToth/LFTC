package lftccompiler;

import Atom.Atom;
import Atom.AtomFactory;
import Atom.NotAtomException;
import IO.EOF;
import IO.ReadFile;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    AtomFactory.handleNewChar(ch);
                    System.out.print(sourceFile.get());
                } catch (NotAtomException ex) {
                    System.err.println(ex);
                    
                }
            } catch (IOException | EOF ex) {
                break;
            }
            
        }

    }
}
