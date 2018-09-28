package Tarea2;

import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal2 {

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean igualdad = true;
        int columnas = 5, filas = 3;
        int contador = 0;
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = contador;
                matrizB[i][j] = contador;
                contador++;
            }
        }

        matrizB[2][1] = 2345;
        /*
        Introducir manualmente los valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduzca el valor de la matriz en el punto [" + (i+1) + "][" + (j+1) + "}]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
         */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    igualdad = false;
                    i = filas + 1;
                    j = columnas + 1;
                } else {
                    igualdad = true;
                }
            }
        }
        
        //comprobar la igualdad
        if (igualdad == true) {
            System.out.println("Ambas matricez son iguales");
        } else {
            System.out.println("Ambas matricez son diferentes");
        }

    }

}
