package Exercicio4_Polimorfismo;

class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        return precoBase * 0.90;
    }
}
