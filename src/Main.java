import br.com.brunorovani.modelos.modelos.Audio;
import br.com.brunorovani.modelos.modelos.Episodio;
import br.com.brunorovani.modelos.modelos.Podcast;
import br.com.brunorovani.modelos.servicos.Processador;
import br.com.brunorovani.modelos.servicos.Rankeador;
import br.com.brunorovani.modelos.modelos.Musica;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Audio> biblioteca = new HashMap<>();

        //Instanciando musicas

        Musica legend = new Musica("Legend", "Drake", 2.5);
        Musica yebbasHeartbreak = new Musica("Yebba's Heartbreak", "Drake", 2.5);

        //Instanciando Podcast

        Podcast podpah = new Podcast("Podpah");

        //Instanciando episodios

        Episodio comOsMelhoresDoMundo = new Episodio("Com os melhores do mundo",
                Arrays.asList("Neymar", "Messi"), 180
        );

        Episodio osFerasDoRap = new Episodio("Os feras do RAP",
                Arrays.asList("Mano Brown", "Emicida"), 160
        );

        //Adicionando o episodio ao seu respectivo podcast

        podpah.adicionarEpisodio(comOsMelhoresDoMundo);
        podpah.adicionarEpisodio(osFerasDoRap);
        //podpah.listarEpisodios();


        //Adicionando audios à bilioteca

        biblioteca.put("Com os melhores do mundo",comOsMelhoresDoMundo);
        biblioteca.put("Os feras do RAP",osFerasDoRap);
        biblioteca.put("Legend", legend);
        biblioteca.put("Yebba's Heartbreak", yebbasHeartbreak);

        //Processando àudios
        //Quando processa, exibe a ficha tecnica

        Processador processador = new Processador();

        processador.processarAudio(legend, 900, 1);
        processador.processarAudio(yebbasHeartbreak, 1000, 999);
        processador.processarAudio(comOsMelhoresDoMundo, 3000, 1500);
        processador.processarAudio(osFerasDoRap, 2500, 1200);

        //RANKEADOR

        Rankeador rankeador = new Rankeador();

        rankeador.adiciona(legend);
        rankeador.adiciona(yebbasHeartbreak);
        rankeador.adiciona(comOsMelhoresDoMundo);
        rankeador.adiciona(osFerasDoRap);

        System.out.println("\nBuscando posição do áudio no ranking dos mais ouvidos...");
        System.out.println("Posição: " + rankeador.buscaNoRank(comOsMelhoresDoMundo));

        System.out.println("\nBuscando áudio por nome...");
        System.out.println(biblioteca.get("Os feras do RAP"));

        rankeador.listaRanking();

    }

}




