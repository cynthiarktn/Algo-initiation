package fr.eql.ai115.algo.init.demo.TP.tpfichier;

public class Demo {
    public static void main(String[] args) {
        Fichier fichier = new Fichier();
        fichier.lecture();

        fichier.setEtat(Fichier.open);
        fichier.lecture();
    }
}
