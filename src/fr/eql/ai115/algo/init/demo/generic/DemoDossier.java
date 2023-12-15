package fr.eql.ai115.algo.init.demo.generic;

import fr.eql.ai115.algo.init.demo.generic.GenericListAndSetHandler;
import fr.eql.ai115.algo.init.demo.oop.Dog;
import fr.eql.ai115.algo.init.demo.oop.Dossier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoDossier {

    public static void main(String[] args) {

        GenericListAndSetHandler<Dog, Dossier> myListAndSet = new GenericListAndSetHandler<>();
        // On ne peut mettre que des objets donc on met Integer
        // T devient String
        // U devient Integer
        Dog dog1 = new Dog("Mimi",5,45,25);

        List<Dog> dogList = myListAndSet.addsSomethingToMyListOfThings(dog1);
        myListAndSet.addsSomethingToMyListOfThings(dog1);
        myListAndSet.addsSomethingToMyListOfThings(dog1);

        Dossier dossier =new Dossier(5,"pdf","Jean");
        Dossier dossier1 =new Dossier(5,"html","Jean");
        Dossier dossier2 =new Dossier(2,"pdf","Jean");


        Set<Dossier> dossierSet = myListAndSet.addsSomethingToMySetOfThings(dossier);
        myListAndSet.addsSomethingToMySetOfThings(dossier1);
        myListAndSet.addsSomethingToMySetOfThings(dossier2);


        for (Dog dog: dogList) {
            System.out.println(dog);
        }

        for (Dossier d: dossierSet) {
            System.out.println(d);
        }

    }

}
