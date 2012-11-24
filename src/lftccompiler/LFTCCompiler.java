package lftccompiler;

import Atom.Atom;
import Atom.AtomFactory;
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
        String fileName = "C:\\Users\\Miki\\Documents\\NetBeansProjects\\LFTCCompiler\\src\\files\\source.funky";
        Vector<Atom> atoms = new Vector(0);


        ReadFile sourceFile = new ReadFile(fileName);

        while (true) {
            try {
                //            try {
                //                AtomFactory.handleNewChar(sourceFile.get());
                //            } catch (IOException | EOF ex) {
                //                break;
                //            }
                //            
                //            if(AtomFactory.isNewAtom())
                //            {
                //            }
                //            }

                            System.out.print(sourceFile.get());
            } catch (    IOException | EOF ex) {
                break;
            }
        }


    }
}
