package Tarea2;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal5 {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un numero para darle el factorial: ");
        numero = sc.nextInt();

        factorial(numero);
    }

    public static void factorial(int a) {
        int numeroFactor = a;
        int total = 1;
        for (int i = a; i > 0; i--) {
            total = total * a;
            a--;
        }
        System.out.println("Factorial de " + numeroFactor + ": " + total);
    }

}
