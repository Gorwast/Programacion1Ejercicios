/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dii
 */
public class LeerEscribir {
    public static void main(String[] args) throws IOException {
        String nombre = "prueba.txt";
        LeerEscribir f = new LeerEscribir();
        f.leer(nombre); System.out.print("\n");
        f.escribir(nombre,true);
        f.leer(nombre);
    }
    
    void leer(String nombre) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(nombre);
        int c;
        while ((c = f.read()) != -1){
            System.out.print((char) c);
        }
        f.close();
    }
    
    void escribir(String nombre, boolean sobreEscribir) throws IOException{
        Scanner sc = new Scanner(System.in);
        if (sobreEscribir == true) {
            FileWriter f = new FileWriter(nombre,sobreEscribir);
            String cadena;
            cadena = sc.nextLine();
            f.write(cadena);
            f.close();
        } else {
            FileWriter f = new FileWriter(nombre);
            String cadena;
            cadena = sc.nextLine();
            f.write(cadena);
            f.close();
        }
        
    }
    
    void escribir(String nombre) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileWriter f = new FileWriter(nombre);
        String cadena;
        cadena = sc.nextLine();
        f.write(cadena);
        f.close();
    }
}
