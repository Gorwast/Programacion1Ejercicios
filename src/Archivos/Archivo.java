
package Archivos;

import java.io.File;
/**
 *
 * @author dii
 */
public class Archivo {

    public static void main(String[] args) {
        File d = new File("prueba.txt");
        String[] listaArchivos = d.list();
        for (int i = 0; i < listaArchivos.length; i++) {
            System.out.println(listaArchivos[i]);
        }
        readFile(d);
        
        File f = new File("prueba.txt");
        
        if (f.exists()) {
            System.out.println("Existe");
            System.out.println("Nombre: " + f.getName());
            System.out.println("Ruta: " + f.getAbsolutePath());
        } else {
            System.out.println("No existe!");
        }
    }
}
