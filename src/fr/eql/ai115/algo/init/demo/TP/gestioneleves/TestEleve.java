package fr.eql.ai115.algo.init.demo.TP.gestioneleves;

import fr.eql.ai115.algo.init.demo.tri.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEleve {
    public static void main(String[] args) {
        Eleve eleve = new Eleve("Sophie");
        eleve.ajouterNote(15);
        eleve.ajouterNote(14);
        eleve.ajouterNote(18);
        eleve.ajouterNote(-2);
        eleve.ajouterNote(21);


        Eleve eleve1 = new Eleve("Lorenzo");
        eleve1.ajouterNote(10);
        eleve1.ajouterNote(14);
        eleve1.ajouterNote(2);
        eleve1.ajouterNote(-2);
        eleve1.ajouterNote(19);


        Eleve eleve2 = new Eleve("Paul");
        eleve2.ajouterNote(20);
        eleve2.ajouterNote(21);
        eleve2.ajouterNote(19);
        eleve2.ajouterNote(18);
        eleve2.ajouterNote(16);


        Eleve eleve3 = new Eleve("Pauline");
        eleve3.ajouterNote(2);
        eleve3.ajouterNote(10);
        eleve3.ajouterNote(15);
        eleve3.ajouterNote(13);
        eleve3.ajouterNote(0);

        List<Eleve> eleves = new ArrayList<>();
        Collections.addAll(eleves, new Eleve[]{eleve, eleve1, eleve2, eleve3});

        for (Eleve e : eleves) {
            System.out.println(e);
        }

        System.out.println("===========Tri de la moyenne par ordre croissant==========");

        // on va trier les données dans la liste
        Collections.sort(eleves);
        for (Eleve e : eleves) {
            System.out.println(e);
        }

    }
}
