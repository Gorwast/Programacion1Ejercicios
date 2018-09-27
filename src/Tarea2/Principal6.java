package Tarea2;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal6 {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int i = 3;

        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();

        inverse(cadena);
    }

    public static void inverse(String cadena) {
        int i;
        i = (cadena.length() - 1);
        do {
            if (cadena.length() == 0) {
                break;
            } else {
                System.out.print(cadena.charAt(i));
                i--;
            }
        } while (i >= 0);

    }

}
