package EX3;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        circulo.imprimir();

        Triangulo triangulo = new Triangulo(3, 4, 5);
        triangulo.imprimir();

        Retangulo retangulo = new Retangulo (4, 2);
        retangulo.imprimir();

        Quadrado quadrado = new Quadrado(4);
        quadrado.imprimir();
    }
}
