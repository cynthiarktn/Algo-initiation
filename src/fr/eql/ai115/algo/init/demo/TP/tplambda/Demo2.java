package fr.eql.ai115.algo.init.demo.TP.tplambda;


public class Demo2 {
    public static void main(String[] args) {
        // tester les lambdas avec demo 2
        Convert distance = (a) -> a/1.609;
        System.out.println("5 km équivaut à " + distance.change(5) + "miles");

        Convert poids = (a) -> a*2.205;
        System.out.println( 4+" kg équivaut à " + poids.change(4) + " livres");
    }



}
