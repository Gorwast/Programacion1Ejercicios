
package paquete2;

import javax.swing.JOptionPane;
/**
 *
 * @author dii
 */


public class Clase2 {
    void ImprimirConsola(String cadena) {
        System.out.println(cadena);
    }
    void ImprimirJOptionPane(String cadena){
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    String metodo(){
        return "hola";
    }
}
