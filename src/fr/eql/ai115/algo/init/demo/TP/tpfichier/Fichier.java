package fr.eql.ai115.algo.init.demo.TP.tpfichier;

public class Fichier {

    public static final int open = 0;
    public static final int close = 1;
    public static final int use = 2;
    private int etat = 1;

    public void setEtat(int etat) {
        this.etat = etat;
    }


    public void lecture() {
        if (etat == open) {
            System.out.println("Lecture du fichier.");
        } else {
            System.out.println("Lecture du fichier impossible.");
        }
    }
}


