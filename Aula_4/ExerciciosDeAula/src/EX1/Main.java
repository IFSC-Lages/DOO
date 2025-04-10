package EX1;

public class Main {
    public static void main(String[] args) {
        Conta poupanca = new Poupanca("Ygor", "1234", 100);
        poupanca.depositar(0);
        poupanca.sacar(1000);
        poupanca.sacar(0);
        poupanca.depositar(1000);
        poupanca.sacar(1000);
        poupanca.extrato();

        Conta corrente = new Corrente("Milena", "9876", 100);
        corrente.depositar(0);
        corrente.sacar(1000);
        corrente.sacar(-1);
        corrente.depositar(1000);
        corrente.sacar(1000);
        corrente.extrato();
    }
}
