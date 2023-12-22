package fr.eql.ai115.algo.init.demo.TP.tpfacture;

public class Facture {

    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public void paiement(){
        status.paiement();
    }
}
