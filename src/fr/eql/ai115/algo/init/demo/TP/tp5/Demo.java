package fr.eql.ai115.algo.init.demo.TP.tp5;

public class Demo {
    public static void main(String[] args) {

        Lettre lettre = new Lettre("Je suis un message.");
        Imprimeur imprimeur = new Imprimeur();
        imprimeur.print(lettre, new Html());

    }


}
