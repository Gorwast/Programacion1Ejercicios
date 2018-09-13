
package Tarea1.tres;

/**
 *
 */
public class Numeros {
    
    public void numeroMayor(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor");
        } else if (a < b) {
            System.out.println(b + " es mayor");
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
    
    public void numerosMultiplos(int a, int b){
        if (a % b == 0) {
            System.out.println("ambos numeros son multiplos");
        } else {
            System.out.println("Ambos numeros no son multiplos");
        }
    }
    
}
