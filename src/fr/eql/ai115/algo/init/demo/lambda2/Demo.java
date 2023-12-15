package fr.eql.ai115.algo.init.demo.lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        System.out.println("===============V1================");
        Plant myTree = new Tree();
        myTree.grow(12);

        System.out.println("===============V2================");
        Plant myCactus = new Plant() {
            @Override
            public void grow(int quantity) {
                System.out.println("Je fais pousser " + quantity + " cactus.");
            }
        };

        myCactus.grow(20);

        System.out.println("===============V3================");
        Plant myBambou = (int quantity) -> System.out.println("Je fais pousser " + quantity + " bambous.");
        myBambou.grow(15);

        System.out.println("===============Stream API================");

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);
        // integerList devient notre collection
        // Tout va être rajouté dans la liste sans à faire addList à chaque fois
        System.out.println(integerList);

        List<Integer> results = integerList.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        // prend la liste et transforme sous forme de flux et filtre les nombres pairs (on fait une condition et on teste si c'est vrai ou faux)
        // on va ensuite collecter les éléments de notre condition

        System.out.println(results);

        // on compte le nombre de nombres impairs
        long l = integerList.stream().filter(x -> x%2 != 0).count();
        System.out.println(l);
        // comme la fonction count() ne retourne que count donc on crée un long pour l'utiliser

        // on met les éléments du tableau au carré
        List<Integer> carres = integerList.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(carres);

        // on double les éléments du tableau
        List<Integer> doubles = integerList.stream().map(x-> x*2).collect(Collectors.toList());
        System.out.println(doubles);

        // on met les éléments du tableau au carré puis on les filtre quand c'est impair
        List<Integer> carresImpairs = integerList.stream().map(x-> x*x).filter(x -> x%2 != 0).collect(Collectors.toList());
        System.out.println(carresImpairs);


        // reduce permet de transformer, filtrer et compter les données
        // subtotal démarre de 0 et après, il rajoute 1
        // x représente chaque élément du tableau
        int somme = integerList.stream().reduce(0,(subtotal,x) -> subtotal+x);
        System.out.println(somme);

        // on met les éléments du tableau au cube puis on les filtre quand c'est pair et on fait la somme des pairs
        // le collector va mettre le résultat dans une nouvelle liste et ensuite doit remettre stream pour ensuite reduce en int
        // mais on peut aussi directement faire reduce sans collect
        int sommePairs = integerList.stream().map(x-> x*x*x).filter(x -> x%2 == 0).reduce(0,(subtotal,x) -> subtotal+x);
        System.out.println(sommePairs);


        // pour trier les données
    }
}
