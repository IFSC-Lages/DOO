package EX2;

public class Comum extends Cliente {

    public Comum(String nome, int idade, String telefone, String sexo, String estadoCivil) {
        super(nome, idade, telefone, sexo, estadoCivil);
    }

    @Override
    public void imprimir() {
        System.out.println(" --- Cliente Comum ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Estado Civil: " + getEstadoCivil() +"\n");
    }
}
