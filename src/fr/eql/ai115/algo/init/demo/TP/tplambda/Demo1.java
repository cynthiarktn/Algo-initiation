package fr.eql.ai115.algo.init.demo.TP.tplambda;

public class Demo1 {
    public static void main(String[] args) {
        // tester distance et poids
        Convert distance = new Distance();
        System.out.println( 5+" km équivaut à " + distance.change(5) + " miles");

        Convert poids = new Poids();
        System.out.println( 4+" kg équivaut à " + poids.change(4) + " livres");
    }
}
