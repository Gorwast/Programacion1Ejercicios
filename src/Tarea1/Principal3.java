
package Tarea1;

import Tarea1.Ordenar;
import java.util.Scanner;

/**
 * @author dii
 */
public class Principal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordenar orden = new Ordenar();
        int lenght = 5;
        int enteros[] = new int[lenght];
        String opcion1;
        char opcion;
        
        for (int i = 0; i < lenght; i++) {
            System.out.print("Introduzca el valor del indice[" + i + "]: ");
            enteros[i] = sc.nextInt();
        }
        System.out.println("¿Desea ordenar el arreglo de forma acendente (a) o descendente (d)?");
        opcion1 = sc.next();
        opcion = opcion1.charAt(0);
        
        if (opcion == 'a') {
            orden.ordenarArrayAsc(enteros);
        } else if (opcion == 'd') {
            orden.ordenarArrayDesc(enteros);
        } else {
            
        }
    }
    
}
