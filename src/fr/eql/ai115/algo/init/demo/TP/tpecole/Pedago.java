package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Pedago {

    Directeur directeur = new Directeur();

    public void pedagoDossier(Dossier pedago){
        System.out.println("Dossier testé, à signer \r\n");
        pedago.setEtat("Inscrit");
        // si on veut classe a veut communiquer avec classe b c'est mieux de faire A = B
        System.out.println("Pedago : " + pedago);

        directeur.dossierDirecteur(pedago);
    }
}
