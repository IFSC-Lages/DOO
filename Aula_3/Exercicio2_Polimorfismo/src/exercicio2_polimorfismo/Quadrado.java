
package exercicio2_polimorfismo;


public class Quadrado extends Forma_geometrica {
    
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea(){
        float area;
        area = this.lado* this.lado;
        System.out.println("A area do quadrado : "+ area);
    }
    
}
