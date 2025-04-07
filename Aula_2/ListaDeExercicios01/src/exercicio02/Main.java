package exercicio02;

public class Main {
    public static void main(String args[]){
        //Criação do objeto
        Conta a = new Conta(123456789, "Juca", 2000f);
        
        //Utilização dos métodos.
        a.sacar(3000);
        a.depositar(2000);
        a.sacar(1000);
        a.extrato();
    }
}
