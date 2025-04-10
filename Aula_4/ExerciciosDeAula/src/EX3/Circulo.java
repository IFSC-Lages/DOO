package EX3;

public class Circulo implements FiguraGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = raio * raio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    @Override
    public void imprimir() {
        System.out.println(" \nOOOO - Círculo - OOOO");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro() +"\n");
    }
}
