package EX3;

public class Triangulo implements FiguraGeometrica{

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double area = (lado1 * lado2)/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    @Override
    public void imprimir() {
        System.out.println("\n ^^^^ - Triangulo - ^^^^ ");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro() + "\n");
    }
}
