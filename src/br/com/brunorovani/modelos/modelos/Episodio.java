package br.com.brunorovani.modelos.modelos;

import br.com.brunorovani.modelos.servicos.Classificavel;

import java.util.ArrayList;
import java.util.List;

public class Episodio extends Audio implements Classificavel {

    private List<String> convidados = new ArrayList<>();

    public Episodio(String titulo, List<String> convidados, double duracao) {
        this.setTitulo(titulo);
        this.convidados = convidados;
        this.setDuracao(duracao);
    }

    @Override
    public double getClassificacao() {
        if(getTotalDeReproducoes() == 0) {
            System.out.println("Não foi possível calcular pois não possui neste episódio");
            return 0;
        }
        double taxaEngajamento = (double) getTotalDeCurtidas()/getTotalDeReproducoes();
        return taxaEngajamento*100;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.printf("Taxa de engajamento de (%s:) %.2f%%%n", getTitulo(), getClassificacao());
    }

    @Override
    public String toString() {
        return "Podcast: (" + getTitulo() +
                ") - Convidados: " + convidados +
                " - Duração: " + getDuracao();
    }


}
