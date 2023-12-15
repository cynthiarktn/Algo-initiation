package fr.eql.ai115.algo.init.demo.TP.tplambda;

public class Convertisseur {
    // méthode convertir qui retourne void et qui fait la conversion en fonction de distance ou poids
    // à tester dans démo 3
    // puis trouver dans la doc la function interface de java pour remplacer convert
    // réécrire démo 1, démo 2 et démo 3 avec cette interface
    public void convertir (Convert v, double unit){
        if (v instanceof Distance) {
            System.out.println("Conversion de " + unit + " km = " + v.change(unit) + " miles ");
        } else {
            System.out.println("Conversion de " + unit + " kg = " + v.change(unit) + " livres ");

        }
    }
}
