package EX3;

public class Quadrado implements FiguraGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado * 2;
        return perimetro;
    }

    @Override
    public void imprimir() {
        System.out.println("\n @@@@ - Quadrado - @@@@");
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro() + "\n");
    }

}
