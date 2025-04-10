package EX1;

public class Corrente extends Conta {

    public Corrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    public void extrato() {
        System.out.println( "\n --- Extrato EX1.Corrente --- ");
        System.out.printf("Titular: %s" + "\n", titular);
        System.out.printf("Numero: %s" + "\n", numero);
        System.out.printf("Saldo: %.2f" + "\n", saldo, "\n");
    }

}
