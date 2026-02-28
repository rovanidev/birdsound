package br.com.brunorovani.modelos.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private String classificacao;

    public void exibeFichaTecnica() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Duração: " + getDuracao());
        System.out.println("Reproduções:  " + totalDeReproducoes);
        System.out.println("Curtidas: " + totalDeCurtidas);
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Utilizo este setter na main

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    //Utilizo este getter no classificador

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    //Utilizo este setter no classificador

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    //Utilizo este getter no classificador

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    //Utilizo este setter no classificador

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

//Método para curtir

    public int curtir(double curtida) {
     return totalDeCurtidas += curtida;
    }

    //Método para reproduzir

    public int reproduzir(double rep) {
        return totalDeReproducoes += rep;
    }

}
