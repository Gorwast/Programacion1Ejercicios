package paquete1;

public class Arreglos {

    public static void main(String[] args) {
        int[] numeros1 = new int[4];
        int numeros2[] = new int[3];
        String[] cadenas1 = new String[5];
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("vocales[0]: " + vocales[0]);
        System.out.println("vocales[1]: " + vocales[1]);

        //ingresar datos Int[]
        numeros1[0] = 30;
        numeros1[1] = 40;
        numeros1[2] = 50;
        numeros1[3] = 60;

        //imprimir el indice indicado en el array de numeros
        for (int k = 0; k < 4; k++) {
            System.out.print("numeros1[" + k + "]: " + numeros1[k]);
            System.out.print(",");
        }
        
        System.out.println("");

        //Array bidimensional
        int[][] numeros3 = new int[3][4];
        numeros3[0][0] = 15;
        numeros3[0][1] = 16;
        numeros3[0][2] = 17;
        numeros3[0][3] = 18;
        numeros3[1][0] = 19;
        numeros3[1][1] = 20;
        numeros3[1][2] = 21;
        numeros3[1][3] = 22;
        numeros3[2][0] = 23;
        numeros3[2][1] = 24;
        numeros3[2][2] = 25;
        numeros3[2][3] = 26;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros3[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
