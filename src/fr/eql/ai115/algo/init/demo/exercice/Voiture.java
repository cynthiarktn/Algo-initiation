package fr.eql.ai115.algo.init.demo.exercice;

public class Voiture {
    private String marque = "Renault";
    private double vitesseMax;
    private double poidsTotal;
    Chassis chassis;
    Moteur moteur;


    public Voiture() {
        this("Renault", 55);
    }

    public Voiture(String marque, int puissanceMoteur) {
        // appel du constructeur a 4 arguments
        this(marque, puissanceMoteur, 120, 100);
    }

    public Voiture(String marque, int puissanceMoteur,
                   double poidsChassis, double poidsMoteur) {
        this.marque = marque;
        this.chassis =new Chassis(poidsChassis);
        this.moteur =new Moteur(puissanceMoteur, poidsMoteur);
        calculerPoidsTotal();
        calculerVitesseMax();
    }

    public void afficher() {
        System.out.println(	"------------------------");
        System.out.println(	"Marque: " + marque);

        //infos moteur
        moteur.affiche();

        //infos chassis
        chassis.affiche();

        // infos calculees
        System.out.println();
        System.out.println(	"Infos Calculees");
        System.out.println(	"Poids Total : " + poidsTotal);
        System.out.println(	"Vitesse Max: " + vitesseMax + "Km/h");
    }

    private void calculerPoidsTotal(){
        poidsTotal = moteur.getPoidsMoteur() + chassis.getPoidsChassis();
    }

    private void calculerVitesseMax(){
        vitesseMax = poidsTotal * moteur.getPuissanceMoteur()/500;
    }
}

