
package Tarea2;

import java.util.Scanner;

/**
 * @author dii
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int columnas = 5, filas = 4; 
        int[][] matriz = new int[columnas][filas]; 
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.println("Introduzca el valor de la matriz en el punto [" + i + "][" + j + "}]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
    
}
