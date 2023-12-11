package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Main {
    public static void main(String[] args) {
        Dossier stagiaire = new Dossier("Jules","110 rue de Paris",
                "jules.lom@gmail.com");

        //System.out.println(stagiaire.toString()); // renvoie le nom de la référence mais est peu compréhensible
        // on va donc redéfinir toString dans l'objet Dossier
        System.out.println(stagiaire);

        Secretariat secretariat = new Secretariat();
        secretariat.validerDossier(stagiaire);
        System.out.println(stagiaire);
    }
}
