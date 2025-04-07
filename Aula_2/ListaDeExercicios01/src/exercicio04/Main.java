package exercicio04;

public class Main {
    public static void main(String args[]){
        //Criação dos objetos.
        Empregado a = new Empregado("Lidiane", "Visintin", 2000.f);
        Empregado b = new Empregado("Joana", "Silva", 5000.f);
        
        //Utilização dos métodos.
        a.salarioAnual();
        a.setSalario(3000f);
        a.salarioAnual();
        b.setSalario(b.getSalario()+ 1000.f);
        b.salarioAnual();
    }
}
