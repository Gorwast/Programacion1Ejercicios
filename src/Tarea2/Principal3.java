
package Tarea2;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal3 {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columnas = 5, filas = 4;
        int contador = 0;
        int suma = 0;
        int matriz[][] = new int[filas][columnas];

        //Llenado de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
        /*
        Llenado manual de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduzca el valor de la matriz en el punto [" + (i+1) + "][" + (j+1) + "}]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
         */

        //Formato de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("\n");
        }

        System.out.println(sumaFilas(matriz, filas, columnas));
        System.out.println(sumaColumnas(matriz, filas, columnas));
    }

    public static String sumaColumnas(int matriz[][], int filas, int columnas) {
        //Suma de columnas 
        String  total = "";
        int mayor = 0, suma = 0;
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                suma = suma + matriz[j][i];
            }
            System.out.println("columna " + i + ": " + suma);
            if (suma > mayor) {
                mayor = suma;
                total = "La columna mayor fue la numero " + i;
            }
            suma = 0;
        }
        return total;
    }
    

    public static String sumaFilas(int matriz[][], int filas, int columnas) {
        String total = "";
        int suma = 0, mayor = 0;
        //Suma de filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];
            }
            System.out.println("fila " + i + ": " + suma);
            if (suma > mayor) {
                mayor = suma;
                total = "La fila mayor fue la numero " + i;
            }
            suma = 0;
        }
        return total;
    }

}
