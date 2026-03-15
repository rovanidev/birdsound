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
        if(getTotalDeReproducoes() == 0 || getTotalDeCurtidas() > getTotalDeReproducoes()) {
            return 0;
        }

        return ((double) getTotalDeCurtidas() / getTotalDeReproducoes()) * 100;
    }

    @Override
    public String toString() {
        return "Musica: (" + getTitulo() +
                ") - Artista: " + artista;
    }
}
