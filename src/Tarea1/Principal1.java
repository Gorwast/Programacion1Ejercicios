package Tarea1;

import java.util.Scanner;

/**
 *
 * @author dii
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Areas Areas = new Areas();
        double base, altura;

        System.out.println("¿Que area desea calcular? Triangulo(t) o Rectangulo(r)");
        
        switch (sc.nextLine()) {
            case "t":
                System.out.print("Introduzca el valor de la base: ");
                base = sc.nextDouble();
                System.out.println("Introduzca el valor de la altura");
                altura = sc.nextDouble();
                System.out.println("El area del triangulo es: " + Areas.areaTriangulo(base, altura));
                break;
            case "r":
                System.out.print("Introduzca el valor de la base: ");
                base = sc.nextDouble();
                System.out.println("Introduzca el valor de la altura");
                altura = sc.nextDouble();
                System.out.println("El area del rectangulo es: " + Areas.areaRectangulo(base, altura));
                break;
            default:
                System.out.println("Disculpe, no he entendido lo que me pidio");
                break;
        }

    }

}
