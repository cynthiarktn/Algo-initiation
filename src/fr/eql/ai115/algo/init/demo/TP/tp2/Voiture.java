package fr.eql.ai115.algo.init.demo.TP.tp2;

public class Voiture {

    private int poids;
    private int puissance;
    private int co2;
    private String marque;

    // génération d'un constructeur
    public Voiture(int poids, int puissance, int co2, String marque) {
        this.poids = poids;
        this.puissance = puissance;
        this.co2 = co2;
        this.marque = marque;
    }

    // constructeur sans arguments pour ajouter des attributs par défaut
    public Voiture(){
        this.poids = 1000;
        this.puissance = 42;
        this.co2 = 5;
        this.marque = "Mercedes";
    }

    // comme la marque est en private, il faut la lire dans un private avec get
    // c'est la seule donnée qu'il nous faut pour faire notre phrase dans main
    public String getMarque() {
        return marque;
    }

    public int pollution(int vitesse){
        return (vitesse * poids *puissance * co2) /2;
    }
}
