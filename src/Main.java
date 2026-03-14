import br.com.brunorovani.modelos.modelos.Audio;
import br.com.brunorovani.modelos.modelos.Episodio;
import br.com.brunorovani.modelos.modelos.Podcast;
import br.com.brunorovani.modelos.servicos.Classificavel;
import br.com.brunorovani.modelos.servicos.Processador;
import br.com.brunorovani.modelos.servicos.Rankeador;
import br.com.brunorovani.modelos.modelos.Musica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        List<Audio> biblioteca = new ArrayList<>();

        //ADICIONANDO MUSICAS NA BIBLIOTECA

        biblioteca.add(new Musica("Legend", "Drake", 2.5));
        biblioteca.add(new Musica("Yebba's Heartbreak", "Drake", 2.5));

        //PODCAST

        Podcast podpah = new Podcast("Podpah");

        //ADICIONANDO EPISODIOS DE PODCAST NA BIBLIOTECA

        biblioteca.add(new Episodio("Com os melhores do mundo",
                Arrays.asList("Neymar", "Messi"), 180
        ));

        biblioteca.add(new Episodio("Os feras do Rap",
                Arrays.asList("Mano Brown", "Emicida"), 160
        ));

        podpah.adicionarEpisodio(biblioteca.get(2));
        podpah.adicionarEpisodio(biblioteca.get(3));
        podpah.listarEpisodios();

        //Processa Audio

        Processador processador = new Processador();

        //Músicas

        processador.processarAudio(biblioteca.get(0), 1000, 899);
        processador.processarAudio(biblioteca.get(1), 1000, 899);

        //Podcasts

        processador.processarAudio(biblioteca.get(2), 3000, 3000);
        processador.processarAudio(biblioteca.get(3), 2576, 1215);

        //RANKEADOR

        Rankeador rankeador = new Rankeador();

        rankeador.adiciona(biblioteca.get(0));
        rankeador.adiciona(biblioteca.get(1));
        rankeador.adiciona(biblioteca.get(2));
        rankeador.adiciona(biblioteca.get(3));


        System.out.println("\nBusca: (" + biblioteca.get(0) + ") - " + rankeador.buscaNoRank((Musica) biblioteca.get(0)) + "° Lugar");

        rankeador.listaRanking();

    }

}



