
package Tarea1.dos;

/**
 *
 * @author dii
 */
public class Ordenar {
    
    static void ordenarArray(int[]array) {
        int n = array.length;
        int var = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                if (array[j-1] > array[j]) {
                    var = array[j-1];
                    array[j-1] =array[j];
                    array[j] = var;
                }
            }
        }
    }
    
    public String selectionSort(int[] ar,int lenght){
        int b[] = new int[lenght];
        for (int i = 0; i < ar.length; i++) {
            int min = i;
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[j]) < ar[min]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        return ar.toString();
    }
}