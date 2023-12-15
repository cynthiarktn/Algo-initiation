package fr.eql.ai115.algo.init.demo.banque;

public class Ccp extends Compte {

    public Ccp(int id, String name, double solde) {
        super(id, name, solde);
    }

    @Override
    public boolean isPossible (Compte compte1, double montant) {
        double frais = compte1.getSolde()*0.05;
        if (compte1.getSolde() < montant+frais) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void transfer(Compte compte1, Compte compte2, double montant) {

        boolean status = isPossible(compte1, montant);
        if (status == false){
            System.out.println("Solde insuffisant, virement impossible");
        }else {
            double frais = compte1.getSolde()*0.05;
            compte1.setSolde(compte1.getSolde()-montant-frais);
            compte2.setSolde(compte2.getSolde()+montant);
            System.out.println("Virement de " + montant + " euros effectué vers le compte de "+
                    compte2.getName() + ". votre nouveau solde est de : " + compte1.getSolde() +
                    " euros.");
        }
    }
}
