package fr.eql.ai115.algo.init.demo.lambda;

import java.util.function.BiFunction;

public class Demo5 {
    public static void main(String[] args) {
        BiFunction <Integer, Integer, Integer> add = (num1,num2) -> num1+num2;
        System.out.println("a + b = " + add.apply(12,25));
        // on change add en "apply" qui est la fonction par défaut
        // on a pas besoin de créer d'interface mais c'est plus clair d'utiliser une interface propre connue

        BiFunction <Integer, Integer, Integer> multiply = (num1,num2) -> num1*num2;
        System.out.println("a x b = " + multiply.apply(12,25));
    }
}
