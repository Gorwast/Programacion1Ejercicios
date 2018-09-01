package paquete1;

/**
 * @author dii
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int a, b;
        boolean r;
        a = 20;
        b = 15;
        
        System.out.println("a > b = " + (a > b)); //a mayor que b
        System.out.println("a < b = " + (a < b)); //a menor que b
        System.out.println("a == b = " + (a == b));//a igual que b
        System.out.println("a >= b = " + (a >= b));//a mayor o igual que b
        System.out.println("a <= b = " + (a <= b));//a menor o igual que b
        System.out.println("a != b = " + (a != b));//a diferente de b
        System.out.println("!(a != b) = " + !(a != b));//No a diferente de b
        
        System.out.println("a >= b && (a == b) = " + ((a >= b) && (a == b))); 
        System.out.println("a >= b || (a == b) = " + ((a >= b) || (a == b)));
    }
}
