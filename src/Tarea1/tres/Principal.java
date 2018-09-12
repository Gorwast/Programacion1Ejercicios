
package Tarea1.tres;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros num = new Numeros();
        int a,b;
        
        System.out.print("introduzca el primer numero: ");
        a = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        b = sc.nextInt();
        System.out.println("Desea saber cual de los 2 numeros es mayor(mayor) o desea saber si ambos numeros son multiplos(mul)?");
        for (int i = 0; i < 2; i++) {
            if (null == sc.nextLine()) {
                System.out.println("No he entendido lo que me pediste, introduce el comando otra vez");
                i = 0;
            } else switch (sc.nextLine()) {
                case "mayor":
                    num.numeroMayor(a, b);
                    break;
                case "multi":
                    num.numerosMultiplos(a, b);
                    break;
                default:
                    System.out.println("No he entendido lo que me pediste, introduce el comando otra vez");
                    i = 0;
                    break;
            }
        }
    }

}
