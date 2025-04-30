package atividade0501;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    public static Produto cadastrar(String nome, double preco) throws PrecoInvalidoException {

   // Método para cadastrar um produto, pode lançar PrecoInvalidoException
        if (preco <= 0) {
            // Lança a exceção personalizada com uma mensagem descritiva
            throw new PrecoInvalidoException("Preço inválido: o preço deve ser maior que zero.");
        }
        // Se o preço for válido, cria e retorna o objeto Produto
        return new Produto(nome, preco);
    }

}
