/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases2;

/**
 *
 * @author dii
 */
public class Matematicas {
    
    final float PI = 02.12345343453451231231231232134523452134123412342342342342342342342342342342341293874691238769123459187235498172364982364928374691872364f;
    
    int potencia(int base){
        int resultado = base * base;
        return resultado;
    }
    int potencia(int base, int potencia){
        int resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
}
