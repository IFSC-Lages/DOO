
package exercicio3_polimorfismo;

class PessoaFisica extends Contato {
    private String nome;
    private String cpf;
    private String dataAniversario;

    public PessoaFisica(String nome, String cpf, String endereco, String dataAniversario) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Física: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Aniversário: " + dataAniversario);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
}