package fr.eql.ai115.algo.init.demo.TP.tp5;

public class Imprimeur {
    public void print (Lettre lettre, IPrint iPrint){
        System.out.println(iPrint.affiche(lettre.getMsg()));
    }

}
