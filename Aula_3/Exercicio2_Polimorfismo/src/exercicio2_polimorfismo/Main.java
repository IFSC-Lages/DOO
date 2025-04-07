
package exercicio2_polimorfismo;


public class Main {


    public static void main(String[] args) {
        
        Forma_geometrica circulo = new Circulo(5);
        Forma_geometrica quadrado = new Quadrado(4);
        Forma_geometrica retangulo = new Retangulo(6, 3);
        Forma_geometrica triangulo = new Triangulo(8, 5);

        circulo.calcularArea();
        quadrado.calcularArea();
        retangulo.calcularArea();
        triangulo.calcularArea();
        
    }
    
}
