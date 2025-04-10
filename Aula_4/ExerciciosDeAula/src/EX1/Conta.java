package EX1;

public abstract class Conta implements Operacoes {
    protected String titular;
    protected String numero;
    protected double saldo;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("DEPÓSITO NÃO REALIZADO \n Valor inválido! \n");
        } else {
            setSaldo(getSaldo()+valor);
            System.out.println("Depósito realizado com sucesso!");
            System.out.printf("Saldo atual: %.2f" + "\n", getSaldo());
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("SAQUE NÃO REALIZADO \n Valor Inválido! \n");
        } else if (valor > getSaldo()) {
            System.out.println("SAQUE NÃO REALIZADO \nSaldo insuficiente!");
            System.out.printf("Saldo atual: %.2f " + "\n", getSaldo(), "\n");
            System.out.println("Valor a ser sacado: " + valor + "\n");
        } else {
            System.out.println("Saque realizado com sucesso!" );
            setSaldo(getSaldo()-valor);
            System.out.printf("Saldo atual: %.2f" + "\n", getSaldo());
        }
    }
    abstract void extrato();

    @Override
    public String toString() {
        return "EX1.Conta{" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
