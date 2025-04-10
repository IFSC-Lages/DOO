package EX2;

public class Main {
    public static void main(String[] args) {
        Comum clienteComun = new Comum("Eduardo",18, "12213", "Masculino", "Solteiro");
        clienteComun.imprimir();

        Vip clienteVip = new Vip ("Miguelito",16, "12346", "Masculino", "Solteiro");
        clienteVip.imprimir();

        Vip clienteVip2 = new Vip ("Rafaela", 23, "2340192", "Feminino", "Casada");
        clienteVip2.imprimir();
    }
}
