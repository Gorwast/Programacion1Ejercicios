
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
        
        Areas ar = new Areas(a,b);
        
        ar.triangulo();
        System.out.println(ar.getBase());
        ar.setBase(b);
        ar.triangulo();
    }
    
}
