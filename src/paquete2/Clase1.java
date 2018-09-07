
package paquete2;
import java.util.Scanner;


/**
 *
 * @author dii
 */
public class Clase1 {
    public static void main(String [] args ){
        String nombre;
        char opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Deseas imprimir por consola (c) o por ventana (v):");
        String cadena = sc.next();
        opcion = cadena.charAt(0);
        
        Clase2 clase = new Clase2();
        
        if (opcion == 'v') {
            clase.ImprimirJOptionPane(nombre);
        } else if (opcion == 'c') {
            clase.ImprimirConsola(nombre);
        }
        
        System.out.println(clase.metodo());
    }
}
