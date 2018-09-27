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

        sumaFilas(matriz, filas, columnas);
        sumaColumnas(matriz, filas, columnas);
    }

    public static void sumaColumnas(int matriz[][], int filas, int columnas) {
        //Suma de columnas 
        int suma = 0;
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                suma = suma + matriz[j][i];
            }
            System.out.println("columna " + i + ": " + suma);
            suma = 0;
        }
    }

    public static void sumaFilas(int matriz[][], int filas, int columnas) {
        int suma = 0;
        //Suma de filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];
            }
            System.out.println("fila " + i + ": " + suma);
            suma = 0;
        }
    }

}
