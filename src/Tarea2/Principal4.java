package Tarea2;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal4 {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "", split = " ", clave;
        String[] cadenaSplit;
        int i = 0, contador = 0;
        boolean noEncontrado;

        
        System.out.print("Introduzca una cadena: ");
        cadena = sc.nextLine();
         
        cadena = cadena.toLowerCase();
        cadenaSplit = cadena.split(split);
        
        System.out.println("Palabra que desea encontrar");
        clave = sc.next().toLowerCase();
        
        Principal4.palabraRepetida(cadenaSplit, clave);

    }

    public static void palabraRepetida(String[] cadena, String clave) {
        int contador = 0, i = 0;
        do {
            if (clave.equals(cadena[i])) {
                contador++;
            }
            i++;
        } while (i < cadena.length);
        if (contador == 0) {
            System.out.println("No se encontro ninguna coincidencia");
        } else {
            System.out.println("se encontro " + contador + " veces");
        }
    }

}
