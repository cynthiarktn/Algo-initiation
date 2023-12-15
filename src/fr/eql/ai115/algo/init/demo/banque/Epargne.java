package fr.eql.ai115.algo.init.demo.banque;

public class Epargne extends Compte {

    public Epargne(int id, String name, double solde) {
        super(id, name, solde);
    }

    @Override
    public boolean isPossible(Compte epargne, double montant) {
        double soldeMax = 20000;
        if(epargne.getSolde() + montant> soldeMax){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void transfer(Compte compte1, Compte epargne, double montant) {
        boolean status = isPossible(compte1, montant);
        if (!status){
            System.out.println("Le solde aprés virement dépassera le plafond autorisé, virement impossible");
        }else {

            compte1.setSolde(compte1.getSolde()-montant);
            epargne.setSolde(epargne.getSolde()+montant);
            double interest =epargne.getSolde()*0.03;
            System.out.println("Virement de " + montant + " euros effectué vers votre compte épargne.\n" +
                    " Votre nouveau solde est de : " + compte1.getSolde() +
                    " euros.\n" + "Le solde de votre épargne est de : "+ epargne.getSolde() + " euros, et vous" +
                    "rapportera "+ interest + " euros sur un An");
        }
    }
}
