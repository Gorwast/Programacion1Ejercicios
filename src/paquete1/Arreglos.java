
package paquete1;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros1 = new int[4];
        int numeros2[] = new int [3];
        String [] cadenas1 = new String [5];
        char vocales[] = {'a','e','i','o','u'};
        System.out.println("vocales[0]: " + vocales[0]);
        System.out.println("vocales[1]: " + vocales[1]);
        numeros1[0] = 30;
        numeros1[1] = 30;
        numeros1[2] = 30;
        numeros1[3] = 30;
        
        System.out.println("numeros1[0]: " + numeros1[0]);
        System.out.println("numeros1[1]: " + numeros1[1]);
        System.out.println("numeros1[2]: " + numeros1[2]);
        System.out.println("numeros1[3]: " + numeros1[3]);
        
        int [][] numeros3 = new int[3][4];
        numeros3[0][0] = 15;
        numeros3[0][1] = 16;
        numeros3[0][2] = 17;
        numeros3[0][3] = 18;
        
        for (int i = 0; i <4; i++) {
            System.out.println("numeros3[0]["+i+"]: " + numeros3[0][i]);
        }
    }
    
}
