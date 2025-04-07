
package exercicio3_polimorfismo;

class PessoaJuridica extends Contato {
    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String razaoSocial, String cnpj, String endereco, double faturamento) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Jurídica: " + razaoSocial + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", Faturamento: R$ " + faturamento);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    
    
}

