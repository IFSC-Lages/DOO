/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade0401;

/**
 *
 * @author lidiane
 */
public class Atividade04DOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Playlist minhaPlaylist = new Playlist();

        // Adicionando músicas
        minhaPlaylist.adicionarMusica(new Musica("Garota de Ipanema", "Tom Jobim", 210));
        minhaPlaylist.adicionarMusica(new Musica("Billie Jean", "Michael Jackson", 294));
        minhaPlaylist.adicionarMusica(new Musica("Hotel California", "Eagles", 390));

        // Listando músicas
        System.out.println("Músicas na playlist:");
        minhaPlaylist.listarMusicas();

        // Removendo uma música
        System.out.println("\n Removendo 'Aquarela'...");
        boolean removida = minhaPlaylist.removerMusica("Aquarela");
        System.out.println(removida ? " Música removida com sucesso." : "️ Música não encontrada.");

        // Listando novamente
        System.out.println("\n Músicas atualizadas na playlist:");
        minhaPlaylist.listarMusicas();

        // Buscando uma música
        System.out.println("\n Buscando 'Hotel California'...");
        Musica buscada = minhaPlaylist.buscarMusica("Hotel California");
        if (buscada != null) {
            System.out.println(" Música encontrada: " + buscada);
        } else {
            System.out.println(" Música não encontrada.");
        }

        // Duração total
        int duracaoTotal = minhaPlaylist.calcularDuracaoTotal();
        int minutos = duracaoTotal / 60;
        int segundos = duracaoTotal % 60; // para saber a sobra dos segundos
        System.out.printf("\n️ Duração total da playlist: %d minutos e %d segundos\n", minutos, segundos);
    }
}
    
    

