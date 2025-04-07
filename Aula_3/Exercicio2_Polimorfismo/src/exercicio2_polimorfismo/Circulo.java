
package exercicio2_polimorfismo;


public class Circulo extends Forma_geometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public void calcularArea(){
        double area = Math.PI *( this.raio * this.raio);
        System.out.println("Área do Círculo: " + area);
    }
    
}
