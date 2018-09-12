/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete1;

import java.util.Scanner;
/**
 * @author lk23
 */
public class Lectura {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        String cadena;
        float f;
        
        System.out.print("Nombre: ");
        cadena = sc.nextLine();
        
        System.out.print("Edad: ");
        n = sc.nextInt();
        
        System.out.print("Estatura: ");
        f = sc.nextFloat();
        
        System.out.println("Hola, " + cadena + ", tienes " + n + " años y mides " + f);
        
    }

}
