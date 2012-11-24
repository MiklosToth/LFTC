
package IO;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Miki
 */
public class ReadFile {
    private FileReader fr;

    public ReadFile(FileReader fr) {
        this.fr = fr;
    }
    
    public char get() throws IOException {
        return (char) fr.read();
    }
    
    
}
