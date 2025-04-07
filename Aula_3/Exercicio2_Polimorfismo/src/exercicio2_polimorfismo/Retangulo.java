
package exercicio2_polimorfismo;


public class Retangulo extends Forma_geometrica {
    
    private float base;
    private float altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
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

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        float area = this.altura*this.base;
        System.out.println("A area do retangulo e: "+area);
    }
}
