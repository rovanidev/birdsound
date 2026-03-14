package br.com.brunorovani.modelos.servicos;

import br.com.brunorovani.modelos.modelos.Audio;

public class Processador {
    public void processarAudio(Audio audio, int totalDeReproducoes, int totalDeCurtidas) {
        audio.curtir(totalDeCurtidas);
        audio.reproduzir(totalDeReproducoes);
        audio.exibeFichaTecnica();
    }
}
