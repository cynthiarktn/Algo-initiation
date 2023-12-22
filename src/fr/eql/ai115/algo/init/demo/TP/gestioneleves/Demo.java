package fr.eql.ai115.algo.init.demo.TP.gestioneleves;

public class Demo {
    public static void main(String[] args) {
        Eleve eleve = new Eleve("Sophie");
        eleve.ajouterNote(15);
        eleve.ajouterNote(14);
        eleve.ajouterNote(18);
        eleve.ajouterNote(-2);
        eleve.ajouterNote(21);

        System.out.println(eleve.toString());
    }
}