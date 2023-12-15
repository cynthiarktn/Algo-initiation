package fr.eql.ai115.algo.init.demo.TP.tp6;

public class Bas implements IMouvement{
    @Override
    public void deplacer(int pas) {
        System.out.println("Je me déplace de " + pas + " pas vers le bas.");
    }
}
