package fr.eql.ai115.algo.init.demo.exercice;

public class Moteur {

    private int puissanceMoteur;
    private double poidsMoteur;

    public Moteur() {
        this(55,100);
    }

    public Moteur(int puissanceMoteur, double poidsMoteur) {
        super();
        this.puissanceMoteur = puissanceMoteur;
        this.poidsMoteur = poidsMoteur;
    }

    public void affiche(){
        //infos moteur
        System.out.println();
        System.out.println(	"Infos Moteur");
        System.out.println(	"Poids: " + poidsMoteur);
        System.out.println(	"Puissance: " + puissanceMoteur + " ch");
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public double getPoidsMoteur() {
        return poidsMoteur;
    }
}
