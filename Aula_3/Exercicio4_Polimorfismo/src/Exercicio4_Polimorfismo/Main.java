package Exercicio4_Polimorfismo;

public class Main {
    
    public static void main(String[] args) {
        
        Produto p1 = new ProdutoEletronico("Smartphone", 2000.00);
        Produto p2 = new ProdutoRoupa("Camiseta", 100.00);
        Produto p3 = new ProdutoLivro("Java para Iniciantes", 150.00);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
    }
}
