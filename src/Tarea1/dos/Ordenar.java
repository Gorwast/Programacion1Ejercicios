
package Tarea1.dos;

/**
 *
 * @author dii
 */
public class Ordenar {
    
    public void ordenarArrayAsc(int[]array) {
        int n = array.length;
        int var = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] > array[j]) {
                    var = array[j-1];
                    array[j-1] =array[j];
                    array[j] = var;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(array[k]);
        }
    }
    
    public void ordenarArrayDesc(int[]array) {
        int n = array.length;
        int var = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] > array[j]) {
                    var = array[j-1];
                    array[j-1] =array[j];
                    array[j] = var;
                }
            }
        }
        for (int k = n-1; k > 0; k--) {
            System.out.println(array[k]);
        }

    }
}