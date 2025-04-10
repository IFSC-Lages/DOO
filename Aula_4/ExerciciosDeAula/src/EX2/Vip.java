package EX2;

public class Vip extends Cliente implements TratamentoVip{
    private double desconto;

    public Vip(String nome, int idade, String telefone, String sexo, String estadoCivil) {
        super(nome, idade, telefone, sexo, estadoCivil);
    }

    @Override
    public void imprimir() {
        System.out.println(" *** Cliente Vip *** ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Estado Civil: " + this.getEstadoCivil());
        calculaDesconto();
        System.out.println("Desconto: " + getDesconto() + "% \n");
    }

    public void calculaDesconto() {
        if (getIdade() < 18) {
            setDesconto(15);
        } else {
            setDesconto(20);
        }
    }
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Olá " + getNome() + ". Venha conferir nossas promoções. Uma oferta especial te aguarda.\n" +
                "Na compra de qualquer produto você terá" + getDesconto() + "de desconto.");
    }
}
