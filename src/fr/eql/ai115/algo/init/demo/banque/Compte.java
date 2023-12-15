package fr.eql.ai115.algo.init.demo.banque;

abstract public class Compte {

    private int id;
    private String name;
    private double solde;

    public Compte(){};

    public Compte(int id, String name, double solde) {
        this.id = id;
        this.name = name;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", solde=" + solde +
                '}';
    }

    abstract public boolean isPossible (Compte compte1, double montant);

    abstract public void transfer(Compte compte1 , Compte compte2, double montant);


}