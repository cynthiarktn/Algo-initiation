package fr.eql.ai115.algo.init.demo.collection;

import fr.eql.ai115.algo.init.demo.oop.Toy; // précise l'import et le chemin

import java.util.ArrayList;
import java.util.List; // toutes les collections il faut le prendre dans cette liste = java.util

public class DemoArrayList {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();

        Toy toy1 = new Toy("balle");
        Toy toy2 = new Toy("souris en plastique");

        toys.add(toy1);
        toys.add(toy2);

        Toy toy3 = new Toy("branche");
        toys.add(1,toy3);

        // doublons
        toys.add(toy1);

        //lister les éléments
        for (Toy t : toys ) {
            System.out.println(t.getName());
        }

        // afficher le toy à la 2eme place
        System.out.println(toys.get(1).getName());

        // afficher l'index de toy numéro 2
        System.out.println(toys.indexOf(toy2));

        // afficher la taille de la collection
        System.out.println(toys.size());

        // supprimer toy 1 et supprimer toy index 0
        toys.remove(toy1);
        toys.remove(0);
        System.out.println(toys.size());

        // imprimer tous les noms des toys restants
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).getName());
        }

        toys.clear();
        System.out.println(toys.isEmpty());
    }
}
