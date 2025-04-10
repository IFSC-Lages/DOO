package EX2;

abstract class Cliente {
    protected String nome;
    protected int idade;
    protected String telefone;
    protected String sexo;
    protected String estadoCivil;

    public Cliente(String estadoCivil, int idade, String nome, String sexo, String telefone) {
        this.estadoCivil = estadoCivil;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public abstract void imprimir();

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "estadoCivil='" + estadoCivil + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
