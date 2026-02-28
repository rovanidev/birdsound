import br.com.brunorovani.modelos.modelos.Audio;
import br.com.brunorovani.modelos.modelos.Episodio;
import br.com.brunorovani.modelos.modelos.Podcast;
import br.com.brunorovani.modelos.servicos.Rankeador;
import br.com.brunorovani.modelos.modelos.Musica;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        //PRIMEIRA MÚSICA

        Musica musica = new Musica("Legend", "Drake", 2.5);

        musica.curtir(1000);
        musica.reproduzir(2000);
        musica.exibeFichaTecnica();

        //SEGUNDA MÚSICA

        Musica musica2 = new Musica("Yebba's Heartbreak", "Drake", 2.5);

        musica2.curtir(200);
        musica2.reproduzir(2000);
        musica2.exibeFichaTecnica();

        //PRIMEIRO PODCAST

        Podcast podpah = new Podcast("Podpah");

        Episodio episodio1 = new Episodio("Com os melhores do mundo",
                Arrays.asList("Neymar", "Messi"), 180
        );
        Episodio episodio2 = new Episodio("Os feras do Rap",
                Arrays.asList("Mano Brown", "Emicida"), 160
        );

        podpah.adicionarEpisodio(episodio1);
        podpah.adicionarEpisodio(episodio2);
        podpah.listarEpisodios();
        episodio1.curtir(100);
        episodio2.curtir(120);
        episodio1.reproduzir(100);
        episodio2.reproduzir(200);

        podpah.exibeFichaTecnica();


        //RANKEADOR

        Rankeador rankeador = new Rankeador();

        rankeador.adiciona(musica);
        rankeador.adiciona(musica2);
        rankeador.adiciona(episodio1);
        rankeador.adiciona(episodio2);


        System.out.println("\nBusca: (" + musica.getTitulo() + ") - " + rankeador.buscaNoRank(musica) + "° Lugar");

        rankeador.listaRanking();

    }
}



