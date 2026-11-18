package org.example;

public class Artista {

    private String nome;
    private String paisOrigem;

    public Artista(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }
}
