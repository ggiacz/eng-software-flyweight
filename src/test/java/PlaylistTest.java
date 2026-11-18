import org.example.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @Test
    void deveRetornarMusicas() {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica("Dia Lindo", "Terno Rei", "Brasil");
        playlist.adicionarMusica("Yoko", "Terno Rei", "Brasil");
        playlist.adicionarMusica("Anna Júlia", "Los Hermanos", "Brasil");

        List<String> saida = Arrays.asList(
                "Musica{titulo='Dia Lindo', artista='Terno Rei', paisOrigem='Brasil'}",
                "Musica{titulo='Yoko', artista='Terno Rei', paisOrigem='Brasil'}",
                "Musica{titulo='Anna Júlia', artista='Los Hermanos', paisOrigem='Brasil'}"
        );

        assertEquals(saida, playlist.obterMusicas());
    }

    @Test
    void deveRetornarTotalArtistas() {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica("Dia Lindo", "Terno Rei", "Brasil");
        playlist.adicionarMusica("Yoko", "Terno Rei", "Brasil");
        playlist.adicionarMusica("Anna Júlia", "Los Hermanos", "Brasil");

        assertEquals(2, ArtistaFactory.getTotalArtistas());
    }

}
