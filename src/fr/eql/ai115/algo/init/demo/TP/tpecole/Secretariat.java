package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Secretariat {
    Testeur testeur = new Testeur();

    public void validerDossier(Dossier secretariat){
        System.out.println("Dossier complété, à valider \r\n");

        System.out.println("Valider dossier");
        secretariat.setEtat("Validé");
        testeur.testerDossier(secretariat);

    }
}
