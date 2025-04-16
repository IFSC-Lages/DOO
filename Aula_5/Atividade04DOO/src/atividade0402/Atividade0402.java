/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade0402;

/**
 *
 * @author lidiane
 */
public class Atividade0402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Historico navegador = new Historico();

        // Simulando visitas a páginas
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.youtube.com");
        navegador.visitarPagina("https://www.github.com");
        navegador.visitarPagina("https://www.stackoverflow.com");

        // Listando o histórico
        System.out.println("\nHistórico atual:");
        navegador.listarHistorico();

        // Voltando uma página
        System.out.println("\nAção: Voltar");
        navegador.voltar();

        // Listando novamente
        System.out.println("\nHistórico após voltar:");
        navegador.listarHistorico();

        // Avançar (modo simplificado)
        System.out.println("\nAção: Avançar");
        navegador.avancar();

        // Listando novamente
        System.out.println("\nHistórico após avançar:");
        navegador.listarHistorico();
    }
}
