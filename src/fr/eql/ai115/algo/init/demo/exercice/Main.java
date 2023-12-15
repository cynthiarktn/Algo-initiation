package fr.eql.ai115.algo.init.demo.exercice;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = null; // voiture pointe sur rien

        if (args.length == 2) {
            voiture=new Voiture(args[0], Integer.parseInt(args[1]));
        } else {
            voiture=new Voiture();
        }

        voiture.afficher();
    }
}
