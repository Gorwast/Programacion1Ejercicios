
package Tarea1.dos;

import java.util.Scanner;

/**
 * @author dii
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordenar orden = new Ordenar();
        int enteros[] = new int[5];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca el valor del indice[" + i + "]: ");
            enteros[i] = sc.nextInt();
        }
        System.out.println("¿Desea ordenar el arreglo de forma acendente (a) o descendente (d)?");
        if (sc.nextLine() == "a") {
            
        } else if (sc.nextLine() == "d") {
            
        } else {
            
        }
    }
    
}
