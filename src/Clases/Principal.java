package Clases;

import java.util.Scanner;

/**
 * @author dii
 */
public class Principal {
    
    Principal(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base = 7, altura = 4;
        Areas a = new Areas(base, altura);
        Scanner sc = new Scanner(System.in);
        /*
        a.altura = altura;
        a.base = base;
         */
        a.rectangulo();
    }

}
