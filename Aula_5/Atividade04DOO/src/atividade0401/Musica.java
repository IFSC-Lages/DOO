/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade0401;

/**
 *
 * @author lidiane
 */
public class Musica {
    private String titulo;
    private String artista;
    private int duracao; // em segundos

    public Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDuracaoFormatada() {
        int minutos = duracao / 60; 
        int segundos = duracao % 60; // resto da divisão para saber o quanto irá sobrar
        return String.format("%02d:%02d", minutos, segundos);
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + getDuracaoFormatada() + ")";
    }
}