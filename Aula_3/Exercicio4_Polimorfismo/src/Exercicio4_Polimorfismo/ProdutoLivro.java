package Exercicio4_Polimorfismo;

class ProdutoLivro extends Produto {
    public ProdutoLivro(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        return precoBase * 0.95; 
    }
}
