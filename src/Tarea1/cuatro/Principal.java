
package Tarea1.cuatro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadena cadena = new Cadena();
        String chain, respuesta;
        
        System.out.print("Introduzca una cadena de caracteres: ");
        chain = sc.nextLine();
        
        System.out.println("Desea cambiar la cadena a minusculas(m) o mayusculas(M)?");
        respuesta = sc.nextLine();
        if ("m".equals(respuesta)) {
            
            System.out.print("Su nueva cadena es: " + cadena.minuscula(chain));
        } else if ("M".equals(respuesta)) {
            cadena.mayuscula(chain);
            System.out.print("Su nueva cadena es: " + chain);
        }
        
    }
    
}
