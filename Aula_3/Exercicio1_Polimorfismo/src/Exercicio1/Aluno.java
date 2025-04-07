
package Exercicio1;


public class Aluno extends Pessoa {
    private int matricula;
    private int ano_nascimento;

    public Aluno(String nome, String cpf, int matricula, int ano_nascimento) {
        super(nome, cpf);
        this.matricula = matricula;
        this.ano_nascimento = ano_nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }    
    
        @Override
    public void falar(){
        System.out.println("Professor nao entendi!");
    }
    
    @Override
    public void perfil(){
        System.out.println("O numero da matricula do aluno:"+ nome + "eh: " +matricula + "o ano de nascimento eh: "+ ano_nascimento + "o cpf eh: "+cpf);
    }

    
    
}
