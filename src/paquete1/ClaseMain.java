package paquete1;


import java.util.Scanner;


/*
* @author dii
*/

public class ClaseMain {
    
    public static String metodoMulti(int a) {
        a = a * 2;
        return (String.valueOf(a));
    }
    
    public static void main (String [] args ) {
        int asdf;
        Metodos cs = new Metodos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola mundo otra vez");
        System.out.println("Introduce un numero");
        asdf = sc.nextInt();
        System.out.println("Tu nuevo numero es: " + metodoMulti(asdf));
        cs.metodo1();
        
    }
}
