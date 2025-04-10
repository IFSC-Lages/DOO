package EX3;

public class Retangulo implements FiguraGeometrica{

    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = largura * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = largura + altura;
        return perimetro;
    }

    @Override
    public void imprimir() {
        System.out.println("\n #### - Retangulo - ####");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro() + "\n");
    }
}
