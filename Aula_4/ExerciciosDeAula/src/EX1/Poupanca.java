package EX1;

public class Poupanca extends Conta {
    private double rendimento;

    public Poupanca(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    @Override
    void extrato() {
        System.out.println( "\n --- Extrato Poupança --- ");
        System.out.printf("Titular: %s" + "\n", titular);
        System.out.printf("Numero: %s" + "\n", numero);
        System.out.printf("Saldo: %.2f" + "\n", saldo);
        calculaRendimento();
        System.out.println("Rendimento:" + rendimento);
        System.out.println("Porcentagem de rendimento:" + (rendimento/saldo*100) + "%");
        System.out.println("Saldo com rendimento:" + (saldo+rendimento) +"\n");
    }

    public double calculaRendimento() {
        setRendimento(saldo*0.10);
        return getRendimento();
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return "EX1.Poupanca{" +
                "rendimento=" + getRendimento() +
                ", titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
