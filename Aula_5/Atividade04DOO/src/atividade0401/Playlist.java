/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade0401;

import java.util.ArrayList;

/**
 *
 * @author lidiane
 */
public class Playlist {
    private ArrayList<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public boolean removerMusica(String titulo) {
        for (Musica musica : musicas) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                musicas.remove(musica);
                return true;
            }
        }
        return false;
    }

    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
        } else {
            for (Musica musica : musicas) {
                System.out.println(musica);
            }
        }
    }

    public Musica buscarMusica(String titulo) {
        for (Musica musica : musicas) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        return null;
    }

    public int calcularDuracaoTotal() {
        int total = 0;
        for (Musica musica : musicas) {
            total += musica.getDuracao();
        }
        return total;
    }
}