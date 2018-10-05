
package Clases;

/**
 *
 * @author dii
 */
public class Areas {
    
    
    float base, altura, area;
    Areas(){
    }
    public Areas(float b, float a){
        base = b;
        altura = a;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    public void triangulo(){
        area = (base * altura)/2;
        imprimir();
    }
    
    public void rectangulo(){
        area = base * altura;
        imprimir();
    }
    
    public void imprimir(){
        System.out.println("El area es: " + area);
    }
}
