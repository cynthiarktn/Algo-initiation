package fr.eql.ai115.algo.init.demo.generic;

import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        GenericListAndSetHandler<String, Integer> myListAndSet = new GenericListAndSetHandler<>();
        // On ne peut mettre que des objets donc on met Integer
        // T devient String
        // U devient Integer

        String s1 = "Hello";

        List<String> stringList = myListAndSet.addsSomethingToMyListOfThings(s1);
        stringList = myListAndSet.addsSomethingToMyListOfThings(s1);
        stringList = myListAndSet.addsSomethingToMyListOfThings(s1);

        Integer one = 1;


        Set<Integer> integerSet = myListAndSet.addsSomethingToMySetOfThings(one);
        integerSet = myListAndSet.addsSomethingToMySetOfThings(one);
        integerSet = myListAndSet.addsSomethingToMySetOfThings(one);


        for (String s: stringList) {
            System.out.println(s);
        }

        for (Integer i: integerSet) {
            System.out.println(i);
        }

    }
}
