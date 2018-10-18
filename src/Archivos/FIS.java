
package Archivos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author dii
 */

public class FIS {
    
    void readFile(String nombre) throws FileNotFoundException, IOException{
        FileInputStream archivo =  new FileInputStream(nombre);
        int caracter;
        while ((caracter = archivo.read()) != -1){
            System.out.print((char)caracter);
        }
        archivo.close();
    }
    
    
}
