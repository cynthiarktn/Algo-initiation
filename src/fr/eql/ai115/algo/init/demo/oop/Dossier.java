package fr.eql.ai115.algo.init.demo.oop;

import java.util.Objects;

public class Dossier {
    private int id;
    private String type;
    private String nom;

    public Dossier() {}

    public Dossier(int id, String type, String nom) {
        this.id = id;
        this.type = type;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    // il faut toujours écrire ces 3 lignes pour un equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dossier d = (Dossier) obj; // la télécommande devient télécommande de dossier, on peut désormais définir les critères de comparaison

        // critères
        if (id == d.id && nom.equals(d.nom)) return true;
        // on peut aussi mettre directement id parce qu'on est déjà dans l'objet car on a accès aux attributs privés


        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id + nom);
    } // hash sert à trouver les objets rapidement
    // implémentation interne de java
    // si on a 2 critères dans equals il faut 2 critères dans le hashcode

    // si deux objets sont identiques au sens equals ils doivent avoir le même hashcode

    @Override
    public String toString() {
        return "Dossier{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
