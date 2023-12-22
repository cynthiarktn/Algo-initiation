package fr.eql.ai115.algo.init.demo.TP.tpcomptable;

public class Main {
    public static void main(String[] args) {

        Comptable comptable = new Comptable(50);

        System.out.println("Le salaire d'un cadre supérieur pour 40h est de " +
                comptable.calculSalaire(40,"Cadre sup")+ " euros.");

        System.out.println("Le salaire d'un cadre pour 40h est de " +
                comptable.calculSalaire(40,"Cadre")+ " euros.");

        System.out.println("Le salaire d'un employé classique pour 40h est de "
                + comptable.calculSalaire(40)+ " euros.");
    }
}
