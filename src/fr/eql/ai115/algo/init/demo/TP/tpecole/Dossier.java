package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Dossier {

    private int id;
    private String nom;
    private String adresse;
    private String email;
    private String etat;

    @Override
    public String toString() {
        return "Dossier{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }



    static int count = 1;
    public Dossier(String nom, String adresse, String email) {
        this.id =count++; // va afficher le numéro d'id
        // des dossiers suivants
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.etat = "None";
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
