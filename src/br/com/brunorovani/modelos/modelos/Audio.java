package br.com.brunorovani.modelos.modelos;

import br.com.brunorovani.modelos.servicos.Classificavel;

public class Audio implements Classificavel {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private String classificacao;

    public void exibeFichaTecnica() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Reproduções:  " + totalDeReproducoes);
        System.out.println("Curtidas: " + totalDeCurtidas);
    }
//
//    public void processarAudio(Audio audio, int totalDeReproducoes, int totalDeCurtidas) {
//        audio.curtir(totalDeCurtidas);
//        audio.reproduzir(totalDeReproducoes);
//        audio.exibeFichaTecnica();
//    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int curtir(double curtida) {
     return totalDeCurtidas += curtida;
    } //Metodo para curtir audios.

    public int reproduzir(double rep) {
        return totalDeReproducoes += rep;
    }//Metodo para reproduzir audios.


    @Override
    public double getClassificacao() {
        return 0;
    }
}