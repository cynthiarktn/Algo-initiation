package fr.eql.ai115.algo.init.demo.TP.tpfacture;

public class Demo {
    public static void main(String[] args) {
        Facture facture = new Facture();
        facture.setStatus(new Ferme());
        facture.paiement();
    }
}
