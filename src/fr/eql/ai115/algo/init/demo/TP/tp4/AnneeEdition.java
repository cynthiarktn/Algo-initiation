package fr.eql.ai115.algo.init.demo.TP.tp4;

public class AnneeEdition implements ISearch{

    @Override
    public boolean search(Livre livre, String critere) {
        if (livre.getAnneeEdition() == Integer.parseInt(critere)) return true;
        return false;

//        // on peut aussi écrire
//        return livre.getAnneeEdition() == Integer.parseInt(critere);

    }
}
