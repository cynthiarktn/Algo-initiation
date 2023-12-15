package fr.eql.ai115.algo.init.demo.TP.tpcompte;

public class CCP extends Compte {

    private double fraisDeTransfert;

    public CCP(int id, String nom, int solde) {
        super(id, nom, solde);
        this.fraisDeTransfert = fraisDeTransfert;
    }

    @Override
    public boolean virer(int compte1, int compte2, int montant) {
        if (Math.random() <70){
            System.out.println("Je débite le compte " + compte1 + " de " + montant);
            System.out.println("Je débite le compte " + compte1 + " de " + fraisDeTransfert);
            System.out.println("Je débite le compte " + compte2 + " de " + montant);

            return true;
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
