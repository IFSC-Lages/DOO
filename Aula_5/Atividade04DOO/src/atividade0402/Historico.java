/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade0402;

import java.util.LinkedList;

/**
 *
 * @author lidiane 
 */
public class Historico {
    private LinkedList<String> historico;

    public Historico() {
        this.historico = new LinkedList<>();
    }

    public void visitarPagina(String url) {
        historico.addLast(url);
        System.out.println("Visitando: " + url);
    }

    public String voltar() {
        if (!historico.isEmpty()) {
            String urlRemovida = historico.removeLast();
            System.out.println("Voltando da página: " + urlRemovida);
            return urlRemovida;
        }
        System.out.println("Histórico vazio. Não há página para voltar.");
        return null;
    }

    public String avancar() {
        if (!historico.isEmpty()) {
            String urlRemovida = historico.removeFirst();
            System.out.println("Avançando para a próxima página (simulado): " + urlRemovida);
            return urlRemovida;
        }
        System.out.println("Histórico vazio. Não há página para avançar.");
        return null;
    }

    public void listarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum histórico de navegação.");
        } else {
            System.out.println("Histórico de Navegação:");
            for (String url : historico) {
                System.out.println(" - " + url);
            }
        }
    }
}
