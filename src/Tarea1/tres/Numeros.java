/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1.tres;

/**
 *
 * @author lk23
 */
public class Numeros {
    
    public static void numeroMayor(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor");
        } else if (a < b) {
            System.out.println(b + " es mayor");
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
    
    public static void numerosMultiplos(int a,int b){
        if (a % b == 0) {
            System.out.println("ambos numeros son multiplos");
        } else if (a % b != 0) {
            System.out.println("Ambos numeros no son multiplos");
        }
    }
    
}
