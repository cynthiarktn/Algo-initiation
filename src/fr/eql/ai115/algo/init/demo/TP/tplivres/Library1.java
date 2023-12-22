package fr.eql.ai115.algo.init.demo.TP.tplivres;

import java.util.ArrayList;
import java.util.List;

public class Library1 {
    public List<Livre> search(List<Livre> livres, int anneeEdition){
        // création d'une methode qui reçoit une liste en entrée et envoie une liste en sortie
        List<Livre> results = new ArrayList<>();

        for (Livre l: livres) {
            if (l.getAnneeEdition() == anneeEdition) results.add(l);

        }
        return results;
    }
}
