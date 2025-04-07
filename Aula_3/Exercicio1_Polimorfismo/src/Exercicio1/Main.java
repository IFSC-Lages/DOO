
package Exercicio1;


public class Main {


    public static void main(String[] args) {
        
        Bolsista b1 = new Bolsista (1200.00, "Jacó", "08994888977", 12,2006);
        Professor p1 = new Professor (12, 1200.00, "Joao", "0899488977");
        Tecnico t1 = new Tecnico (10, "Marcos", "12234555487", 18, 2007);
        
        b1.falar();
        b1.setNome("JOnas");
        b1.perfil();
        b1.renovarBolsa();
        b1.perfil();
        
        p1.falar();
        p1.perfil();
        
        t1.falar();
        t1.perfil();
        t1.registroProfissional();
    }
    
}
