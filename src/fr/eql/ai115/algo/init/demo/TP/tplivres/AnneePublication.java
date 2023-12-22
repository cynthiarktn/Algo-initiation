package fr.eql.ai115.algo.init.demo.TP.tplivres;

public class AnneePublication implements ISearch{

    @Override
    public boolean search(Livre livre, String critere) {
        if (livre.getAnneePublication() == Integer.parseInt(critere)) return true;
        return false;

//        // on peut aussi écrire
//        return livre.getAnneePublication() == Integer.parseInt(critere);

    }
}
