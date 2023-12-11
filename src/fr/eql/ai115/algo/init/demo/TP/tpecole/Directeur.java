package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Directeur {

    public void dossierDirecteur (Dossier directeur){
        System.out.println("Dossier signé, à archiver \r\n");
        directeur.setEtat("Signé");
        // si on veut classe a veut communiquer avec classe b c'est mieux de faire A = B
        System.out.println("Directeur : " + directeur);
    }
}
