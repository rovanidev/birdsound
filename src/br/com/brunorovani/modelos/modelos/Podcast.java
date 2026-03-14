package br.com.brunorovani.modelos.modelos;
import br.com.brunorovani.modelos.servicos.Classificavel;

import java.util.ArrayList;
import java.util.List;

public class Podcast implements Classificavel{

    private String titulo;

    private List<Episodio> episodios = new ArrayList<>();

    public Podcast(String titulo) {
        this.titulo = titulo;
    }

    public String Podcast() {
        return titulo;
    }

    public void adicionarEpisodio(Classificavel ep) {
        if(ep instanceof Episodio) {
            Episodio episodio = (Episodio) ep;
            episodios.add(episodio);
        }
    }


    public void listarEpisodios() {
            System.out.println("\nEpisódios de: " + titulo);
        for (Episodio ep : episodios) {
            System.out.println(ep);
        }
    }

    public double totalEpisodios() {
        return episodios.size();
    }

    public double totalCurtidasDosEpisodios() {
        double somaDasCurtidasDosEpisodios = 0;

        for (Episodio ep: episodios) {
            somaDasCurtidasDosEpisodios += ep.getTotalDeCurtidas();
        }
        return somaDasCurtidasDosEpisodios;
    }//Pega a avaliação individual de cada episódio e retorna a soma.

    public double totalReproducoesDosEpisodios() {
        double somaDasReproducoesDosEpisodios = 0;

        for (Episodio ep: episodios) {
            somaDasReproducoesDosEpisodios += ep.getTotalDeReproducoes();
        }
        return somaDasReproducoesDosEpisodios;
    } //Calcula a quantidade de views de cada episodio e retorna a soma.


    @Override
    public double getClassificacao() {
        if(totalReproducoesDosEpisodios() == 0) {
            System.out.println("Não foi possível calcular pois os episódios ainda não foram vistos.");
            return 0;
        } //Caso a soma for igual a zero a conta não fecha, já que seria impossivel haver curtidas e a taxa de engajamento seria 0.

        double taxaEngajamento = totalCurtidasDosEpisodios()/ totalReproducoesDosEpisodios();
        return taxaEngajamento*100;

    }

    public void exibeFichaTecnica() {
        System.out.println("Total de Episódios: " + totalEpisodios());
        System.out.println("Total de Curtidas dos ep's: " + totalCurtidasDosEpisodios());
        System.out.println("Total de Reproduções: " + totalReproducoesDosEpisodios());
        System.out.printf("Taxa de engajamento do %s: %.2f%%%n", titulo, getClassificacao());
    } //Ficha tecnica individual de cada obj Podcast.

}