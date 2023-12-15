package fr.eql.ai115.algo.init.demo.TP.tp4;

import java.util.ArrayList;
import java.util.List;

public class Library2 {

    public List<Livre> search(List<Livre> livres, int anneeEdition){
        // création d'une methode qui reçoit une liste en entrée et envoie une liste en sortie
        List<Livre> results = new ArrayList<>();

        for (Livre l: livres) {
            if (l.getAnneeEdition() == anneeEdition) results.add(l);

        }
        return results;
    }

    public List<Livre> searchPublication(List<Livre> livres, int anneePublication){
        // création d'une methode qui reçoit une liste en entrée et envoie une liste en sortie
        List<Livre> results = new ArrayList<>();

        for (Livre l: livres) {
            if (l.getAnneePublication() == anneePublication) results.add(l);

        }
        return results;
    }
}
