package br.com.brunorovani.modelos.modelos;
import br.com.brunorovani.modelos.servicos.Classificavel;

import java.util.ArrayList;
import java.util.List;

public class Podcast extends Audio implements Classificavel{

    private List<Episodio> episodios = new ArrayList<>();

    public Podcast(String titulo) {
        setTitulo(titulo);
    }

    public String Podcast() {
        return getTitulo();
    }

    public void adicionarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }


    public void listarEpisodios() {
            System.out.println("\nEpisódios de: " + getTitulo());
        for (Episodio ep : episodios) {
            System.out.println(ep);
        }

        //Na main aparece um episodio em cima do outro, depois posso criar uma classe que cudia dos episodios e mostrar os episodios pelo seu indice de adicao

    }

    public double totalEpisodios() {
        return episodios.size();
    }

    public double totalCurtidas() {
        double somaDasCurtidasDosEpisodios = 0;

        for (Episodio ep: episodios) {
            somaDasCurtidasDosEpisodios += ep.getTotalDeCurtidas();
        }
        return somaDasCurtidasDosEpisodios;
    }

    public double totalReproducoes() {
        double somaDasReproducoes = 0;

        for (Episodio ep: episodios) {
            somaDasReproducoes += ep.getTotalDeReproducoes();
        }
        return somaDasReproducoes;
    }


    @Override
    public double getClassificacao() {
        if(totalReproducoes() == 0) {
            System.out.println("Não foi possível calcular pois os episódios ainda não foram vistos.");
            return 0;
        }

        double taxaEngajamento = totalCurtidas()/totalReproducoes();
        return taxaEngajamento*100;

    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Total de Episódios: " + totalEpisodios());
        System.out.println("Total de Curtidas dos ep's: " + totalCurtidas());
        System.out.println("Total de Reproduções: " + totalReproducoes());
        System.out.printf("Taxa de engajamento do %s: %.2f%%%n", getTitulo(), getClassificacao());
    }
    //Ao inves de reproducao, vamos ver com compartilhamento o engajamento! Ou nao, sei la
}




//Ao anotar tive a seguinte ideia de que podcast armazena uam determinada quantidade de apresentadores e convidados, nunca um sendo como outro, acho que cada podcast poderia ter um episodio que herda de podcast, faz sentido?

//Pensar nisso futuramente...

//Dai ao instanciar o podcast em si, eu colocaria de quais apresentadores e o podcast e convidade seria algo especifico de cada episodio, dai teria um sistema de avaliacao unico para cada episodio e com isso eu poderia criar uma regrinha de avaliacao mais diferenciada para podcast.


//SO PRECISO USAR O GETCLASSIFICAO PARA MOSTRAR A TAXA E ACABOU