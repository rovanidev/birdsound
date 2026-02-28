package br.com.brunorovani.modelos.servicos;

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
            System.out.println("Falha na busca!");
        }

        itens.sort(Comparator.comparing(Classificavel::getClassificacao).reversed());

        return itens.indexOf(item) + 1;
    }

    public void listaRanking() {
        System.out.println("\nRanking: ");
            for (int i = 0; i < itens.size() ; i++) {
                System.out.println(i + 1 + "° " + itens.get(i));

        }
    }

}
