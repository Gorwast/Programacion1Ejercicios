package Clases;

import java.util.Scanner;

/**
 *
 * @author dii
 */
public class Clase1 {

    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);
        Clase1 clase = new Clase1();
        subClase1 subClase = new subClase1();
        
        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();
        clase.imprimir(cadena);
        clase.imprimir2(cadena);
        subClase.imprimir3(cadena);
    }

    void imprimir(String c) {
        System.out.println("]La cadena es: " + c);
    }
    //metodo sobrecargado
    void imprimir(String c, String b) {
        System.out.println("]La cadena es: " + c);
    }
}

class subClase1 {
    
    //metodo protegido
    protected void imprimir3(String c){
        System.out.println("");
    }
    
    //metodo privado
    private void imprimir4(String c){
        System.out.println("");
    }
    
}
