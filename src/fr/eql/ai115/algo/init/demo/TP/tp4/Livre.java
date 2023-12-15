package fr.eql.ai115.algo.init.demo.TP.tp4;

public class Livre {
    private int id;
    public String titre;
    private int anneePublication;
    private int anneeEdition;
    private double prix;

    public Livre() {}

    public Livre(int id, String titre, int anneePublication, int anneeEdition, double prix) {
        this.id = id;
        this.titre = titre;
        this.anneePublication = anneePublication;
        this.anneeEdition = anneeEdition;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", anneePublication=" + anneePublication +
                ", anneeEdition=" + anneeEdition +
                ", prix=" + prix +
                '}';
    }
}
