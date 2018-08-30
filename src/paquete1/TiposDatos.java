package paquete1;

import java.util.Scanner;

public class TiposDatos {
    
    int Datos;

    public static void main(String[] args) {
        TiposDatos asdf = new TiposDatos();
        
        int ENTERO;
        byte BYTE;
        short SHORT;
        long LONG;
        char vocal;
        
        ENTERO = 45;
        LONG = 999999;
        BYTE = 110;
        SHORT = (short) 37240;
        System.out.println("El valor de ENTERO es: " + ENTERO);
        System.out.println("El valor de LONG es: " + LONG);
        System.out.println("El valor de BYTE es: " + BYTE);
        System.out.println("El valor de SHORT es: " + SHORT);
        System.out.println("El valor de ENTERO de clase es: " + asdf.Datos);
        asdf.Datos = asdf.Datos + 3;
        System.out.println(asdf.Datos);
            
    }
}
