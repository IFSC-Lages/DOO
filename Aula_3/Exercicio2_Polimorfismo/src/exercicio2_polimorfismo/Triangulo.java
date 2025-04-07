
package exercicio2_polimorfismo;


public class Triangulo extends Forma_geometrica {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        double area = (this.altura * this.base)/2;
        System.out.println("Area do triangulo" + area);
    }
    
}
