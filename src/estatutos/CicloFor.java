package estatutos;

import java.util.Scanner;

/**
 *
 * @author dii
 */
public class CicloFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n;

        //System.out.println("Que tabla desea calcular?");
        //n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(j + " * " + i + " = " + (j * i));
            }
        }
    }
}
