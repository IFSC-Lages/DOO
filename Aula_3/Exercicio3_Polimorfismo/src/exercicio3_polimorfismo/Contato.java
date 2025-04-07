package exercicio3_polimorfismo;

abstract class Contato {
    protected String endereco;

    public Contato(String endereco) {
        this.endereco = endereco;
    }

    public abstract void exibirDetalhes();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}

