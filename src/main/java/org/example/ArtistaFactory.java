package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArtistaFactory {
    private static Map<String, Artista> artistas = new HashMap<>();

    public static Artista getArtista(String nome, String paisOrigem) {
        Artista artista = artistas.get(nome);
        if (artista == null) {
            artista = new Artista(nome, paisOrigem);
            artistas.put(nome, artista);
        }
        return artista;
    }

    public static int getTotalArtistas() {
        return artistas.size();
    }
}
