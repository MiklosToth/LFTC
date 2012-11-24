package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Miki
 */
public class ReadFile {

    private File file;
    private FileInputStream fis;

    public ReadFile(String fileName) {
        file = new File(fileName);
        if (!file.exists()) {
            System.out.println(fileName + " does not exist.");
            return;
        }

        if (!(file.isFile() && file.canRead())) {
            System.out.println(file.getName() + " cannot be read from.");
            return;
        }

        try {
            fis = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("Something is wrong in ReadFile constructor");
            return;
        }

    }

    public char get() throws IOException, IO.EOF {
        int c = fis.read();
        
        if(c == -1) {
            throw new EOF();
        }
        
        return (char) c;
    }

}
