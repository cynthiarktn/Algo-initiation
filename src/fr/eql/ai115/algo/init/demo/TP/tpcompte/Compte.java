package fr.eql.ai115.algo.init.demo.TP.tpcompte;

public abstract class Compte {

    private int id;
    private String nom;
    private int solde;

    public Compte() {}

    public Compte(int id, String nom, int solde) {
        this.id = id;
        this.nom = nom;
        this.solde = solde;
    }

    abstract public boolean virer(int compte1, int compte2, int montant);

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", solde=" + solde +
                '}';
    }
}
