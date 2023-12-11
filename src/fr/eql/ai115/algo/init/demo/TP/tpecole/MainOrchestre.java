package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class MainOrchestre {
    public static void main(String[] args) {
        Dossier stagiaire = new Dossier("Jules","110 rue de Paris",
                "jules.lom@gmail.com");

        //System.out.println(stagiaire.toString()); // renvoie le nom de la référence mais est peu compréhensible
        // on va donc redéfinir toString dans l'objet Dossier

        nouveauDossier(stagiaire);

    }

    private static void nouveauDossier(Dossier stagiaire){
        System.out.println(stagiaire);

        Secretariat secretariat = new Secretariat();
        secretariat.validerDossier(stagiaire);

        Testeur testeur = new Testeur();
        testeur.testerDossier(stagiaire);

        Pedago pedago = new Pedago();
        pedago.pedagoDossier(stagiaire);

        Directeur directeur = new Directeur();
        directeur.dossierDirecteur(stagiaire);

    }
}
