package lftccompiler;

import Atom.Atom;
import IO.EOF;
import IO.ReadFile;
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
                //AtomFactory.handleNewChar(sourceFile.get());
                System.out.print(sourceFile.get());
            } catch (IOException | EOF ex) {
                break;
            }
            
        }

    }
}
