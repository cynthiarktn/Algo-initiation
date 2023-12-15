package fr.eql.ai115.algo.init.demo.inheritance1;

public class Pere {

    /// Attributs///
//    protected String nom; // accessible pour les héritiers alors que private non

    private String nom;

    public Pere(String nom) {
        this.nom = nom;
    }
    // toujours créer un constructeur sans argument

    public void parler(){
        System.out.println("Pere : Je parle français.");
    }

    public void marcher(){
        System.out.println("Pere : Je marche en ***************");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
