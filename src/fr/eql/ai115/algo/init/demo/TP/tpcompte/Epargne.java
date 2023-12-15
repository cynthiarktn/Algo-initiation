package fr.eql.ai115.algo.init.demo.TP.tpcompte;

public class Epargne extends Compte{

    private double txInteret;

    public Epargne(int id, String nom, int solde) {
        super(id, nom, solde);
        this.txInteret = txInteret;
    }


    @Override
    public boolean virer(int compte1, int compte2, int montant) {
        if (Math.random() <70){
            System.out.println("Je débite le compte " + compte1 + " de " + montant);
        }
        return false;
    }
}
