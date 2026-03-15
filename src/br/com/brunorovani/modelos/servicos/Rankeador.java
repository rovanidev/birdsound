package br.com.brunorovani.modelos.servicos;

import br.com.brunorovani.modelos.modelos.Episodio;
import br.com.brunorovani.modelos.modelos.Musica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Rankeador {

    private List<Classificavel> itens = new ArrayList<>();

    public void adiciona(Classificavel item) {

        itens.add(item);
    }

    public int buscaNoRank(Classificavel item) {
        if(item.getClassificacao() == 0) {
            return -1;
        }

        itens.sort(Comparator.comparing(Classificavel::getClassificacao).reversed());
        return itens.indexOf(item) + 1;

    }


    public void listaRanking() {
        System.out.println("\nRanking dos mais ouvidos: ");
        int posicaoExibida = 1;

        for (int i = 0; i < itens.size(); i++) {
            Classificavel item = itens.get(i);

            if (item.getClassificacao() == 0) {
                continue;
            }

            System.out.println(posicaoExibida + "° " + item);
            posicaoExibida++;
        }
    }
}