package fr.eql.ai115.algo.init.demo.TP.tplambda;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {

        // conversion en miles avec function
        Function <Double, Double> distance = (a) -> (a / 1.609);
        System.out.println("Conversion en miles de 5 km = " + distance.apply(5d));

        // conversion en livres avec function
        Function <Double, Double> poids = (a) -> (a * 2.205);
        System.out.println("Conversion en livres de 4 kg = " + poids.apply(4d));

    }
}
