package fr.eql.ai115.algo.init.demo.TP.tp2;

public class Main {
    public static void main(String[] args) {

        Voiture mercedesAmg = new Voiture
                (2000,70,5,"Mercedes AMG");

        // la voiture1 va prendre les attributs par défaut
        Voiture voiture1 = new Voiture();


        System.out.println("Le taux de pollution d'une " + mercedesAmg.getMarque()+
                " est de " + mercedesAmg.pollution(80)
        );
    }
}
