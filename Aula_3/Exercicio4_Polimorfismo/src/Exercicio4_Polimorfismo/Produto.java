package Exercicio4_Polimorfismo;

abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço final: R$ " + calcularPreco());
    }
}
