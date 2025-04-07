
package Exercicio1;


public class Bolsista extends Aluno {
    
    private double valor_bolsa;

    public Bolsista(double valor_bolsa, String nome, String cpf, int matricula, int ano_nascimento) {
        super(nome, cpf, matricula, ano_nascimento);
        this.valor_bolsa = valor_bolsa;
    }
    
    public void renovarBolsa (){
        this.valor_bolsa = this.valor_bolsa + 100;
    }

    public double getValor_bolsa() {
        return valor_bolsa;
    }

    public void setValor_bolsa(double valor_bolsa) {
        this.valor_bolsa = valor_bolsa;
    }

    @Override
    public void perfil(){
        System.out.println("O numero da matricula do aluno: "+ nome + " eh: "+ getMatricula() + " o ano de nascimento eh: "+ getAno_nascimento() +  " o cpf eh: "+ cpf + " o valor da bolsa do aluno eh: "+ valor_bolsa);
    }
    
}
