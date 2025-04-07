
package Exercicio1;


public class Tecnico extends Aluno {
    
    private int num_registro;

    public Tecnico(int num_registro, String nome, String cpf, int matricula, int ano_nascimento) {
        super(nome, cpf, matricula, ano_nascimento);
        this.num_registro = num_registro;
    }
    
    

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void registroProfissional(){
        System.out.println("O numero do registro profissional eh: "+ num_registro);
    }
    
    @Override
    public void perfil(){
        System.out.println("O numero da matricula do aluno: "+ nome + " eh: "+ getMatricula() + " o ano de nascimento eh: "+ getAno_nascimento() +  " o cpf eh: "+ cpf + " o numero de registro do tecnico eh: "+ num_registro);
    }
    
}
