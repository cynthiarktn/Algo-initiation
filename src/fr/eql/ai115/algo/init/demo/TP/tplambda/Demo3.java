package fr.eql.ai115.algo.init.demo.TP.tplambda;

public class Demo3 {
    public static void main(String[] args) {
        // conversion distance ou poids

        Convertisseur convertisseur = new Convertisseur();

        // convertir 5 km en miles
        Convert distance = new Distance();
        convertisseur.convertir(distance,5);

        // convertir 4kg en pounds
        Convert poids = new Poids();
        convertisseur.convertir(poids,4);

    }
}
