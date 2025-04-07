
package Exercicio1;


public class Professor extends Pessoa {
    
    private int siape;
    private double salario;

    public Professor(int siape, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.siape = siape;
        this.salario = salario;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        @Override
    public void falar (){
        System.out.println("Alguma duvida?");
    }

    @Override
    public void perfil(){
        System.out.println("O numero do siape do professor: "+ nome + " eh: " +siape + " o salario eh: "+ salario + " o cpf eh: "+cpf);
    }

    
}
