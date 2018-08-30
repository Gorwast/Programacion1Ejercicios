
package paquete1;

public class TiposDatos2 {

    public static void main(String[] args) {
        String cadena;
        char c;
        c = 'e';
        
        cadena = "esta es una cadena";
        System.out.println(cadena);
        System.out.print(cadena.charAt(0));
        System.out.print(cadena.charAt(1));
        System.out.print(cadena.charAt(2));
        System.out.print(cadena.charAt(3));
        System.out.print(cadena.charAt(4));
        System.out.print(cadena.charAt(5) + "\n");
        cadena = String.valueOf(c);
        System.out.println(cadena);
    }
}
