package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(String titulo, String nomeArtista, String paisOrigem) {
        Artista artista = ArtistaFactory.getArtista(nomeArtista, paisOrigem);
        Musica musica = new Musica(titulo, artista);
        musicas.add(musica);
    }

    public List<String> obterMusicas() {
        List<String> saida = new ArrayList<String>();
        for (Musica musica : this.musicas) {
            saida.add(musica.obterMusica());
        }
        return saida;
    }
}
