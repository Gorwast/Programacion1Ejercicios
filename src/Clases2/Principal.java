
package Clases2;

import Clases.Areas;

/**
 * @author dii
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float b = 7;
        float a = 9;
        int base = 8,potencia = 3;
        //clase nombreDeObjeto = new ConstructorDeClase(parametros);
        Areas ar = new Areas(a,b);
        Matematicas m = new Matematicas();
        
        /*
        ar.triangulo();
        System.out.println(ar.getBase());
        ar.setBase(b);
        ar.triangulo();
        */
        
        System.out.println("El elevado al cuadrado es: " + m.potencia(base));
        System.out.println("El elevado a la " + potencia + " es: " + m.potencia(base,potencia));
    }
    
}
