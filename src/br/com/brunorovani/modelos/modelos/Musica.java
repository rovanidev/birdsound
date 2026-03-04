package br.com.brunorovani.modelos.modelos;

import br.com.brunorovani.modelos.servicos.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String artista;

    public Musica(String titulo, String artista, double duracao) {
        this.setTitulo(titulo);
        this.artista = artista;
        this.setDuracao(duracao);
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica(); //Com isto utilizo o que já existe na superclasse Audio.
        System.out.println("Artista: " + artista);
        System.out.printf("Taxa de engajamento: %.2f%%\n", getClassificacao());
    }

    @Override
    public double getClassificacao() {

        if(getTotalDeReproducoes() == 0) {
            System.out.println("Não foi possível calcular a taxa de engajamento, pois a música ainda não foi reproduzida!");
            return 0;
        } else if(getTotalDeCurtidas() > getTotalDeReproducoes()) {
            System.out.println("Não foi possível calcular a taxa de engajamento, pois é impossível a música ter mais curtidas do que reproduções");
            return 0;
        }

        double taxaEngajamento = (double) getTotalDeCurtidas()/getTotalDeReproducoes();
        return taxaEngajamento * 100;

    }

    @Override
    public String toString() {
        return "Musica: (" + getTitulo() +
                ") - Artista: " + artista;
    }
}
