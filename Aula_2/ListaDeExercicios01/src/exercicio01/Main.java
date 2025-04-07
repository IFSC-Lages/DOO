package exercicio01;

public class Main {
    public static void main(String[] args) {
       //Criação dos dois objetos.
       Pessoa a = new Pessoa("Juca", 78, 30);
       Pessoa b = new Pessoa("Joaozinho", 70, 20);
       
       //Utilização dos métodos.
       a.caminha();
       a.caminha();
       a.come();
       a.fazAniversario();
       a.imprime();
       
       b.caminha();
       b.caminha();
       b.come();
       b.come();
       b.come();
       b.come();
       b.come();
       b.come();
       b.come();
       b.fazAniversario();
       b.imprime();
    }
}
