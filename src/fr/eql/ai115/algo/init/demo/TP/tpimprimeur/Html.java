package fr.eql.ai115.algo.init.demo.TP.tpimprimeur;

public class Html implements IPrint {

    @Override
    public String affiche(String mot) {
        return "J'imprime " + mot + "en HTML";
    }
}
