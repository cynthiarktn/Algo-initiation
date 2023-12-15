package fr.eql.ai115.algo.init.demo.TP.tp4;

import java.util.ArrayList;
import java.util.List;

public class Library3 {

    public List<Livre> search(List<Livre> livres, ISearch algo, String critere){
        // création d'une methode qui reçoit une liste en entrée et envoie une liste en sortie
        List<Livre> results = new ArrayList<>();

        for (Livre l: livres) {
            if (algo.search(l, critere)) results.add(l);
        }
        return results;
    }
}
