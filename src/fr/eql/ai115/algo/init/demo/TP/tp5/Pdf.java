package fr.eql.ai115.algo.init.demo.TP.tp5;

public class Pdf implements IPrint{

    @Override
    public String affiche(String mot) {
        return "J'imprime " + mot + "en PDF";
    }
}
