package br.com.brunorovani.modelos.modelos;

import br.com.brunorovani.modelos.servicos.Classificavel;

import java.util.ArrayList;
import java.util.List;

public class Episodio extends Audio implements Classificavel {

    private List<String> convidados = new ArrayList<>();

    public Episodio(String titulo, List<String> convidados, double duracao) {
        this.convidados = convidados;
        this.setDuracao(duracao);
        this.setTitulo(titulo);
    }

    @Override
    public double getClassificacao() {
        if(getTotalDeReproducoes() == 0) {
            System.out.println("Não foi possível calcular pois não possui neste episódio");
            return 0;
        }
        double taxaEngajamento = getTotalDeCurtidas()/getTotalDeReproducoes();
        return taxaEngajamento*100;
    }


    @Override
    public String toString() {
        return "Podcast: (" + getTitulo() +
                ") - Convidados: " + convidados +
                " - Duração: " + getDuracao();
    }


}
