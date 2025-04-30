package atividade0501;

import static atividade0501.Produto.cadastrar;

public class Main {

    public static void main(String[] args) {
        try {
            // Tentativa de cadastrar um produto com preço válido
            Produto produto1 = cadastrar("Livro", 25.99);
            System.out.println("Produto cadastrado com sucesso: " + produto1); // Imprime o produto cadastrado

            // Tentativa de cadastrar um produto com preço inválido (0)
            Produto produto2 = cadastrar("Caneta", 0); //irá lançar a exceção
            System.out.println("Produto cadastrado com sucesso: " + produto2); // Esta linha não será executada

        } catch (PrecoInvalidoException e) {
            // Captura a exceção PrecoInvalidoException e exibe a mensagem de erro
            System.err.println("Erro ao cadastrar produto: " + e.getMessage());
        }

        System.out.println("Fim do programa."); // Indica que o programa terminou sua execução

    }

}
