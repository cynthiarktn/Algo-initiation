package fr.eql.ai115.algo.init.demo.inheritance1;

public class Fils extends Pere{

    private String prenom;

    public Fils(String nom, String prenom) {
        super(nom); // appelle le constructeur du père
        this.prenom = prenom;
    }

    @Override // veut dire que c'est hérité
    public void parler() {
        super.parler(); // super s'adresse toujours à la classe Père
        System.out.println("Fils :Je parle anglais");

    }

    @Override
    public void marcher() {
        super.marcher();
        System.out.println("Fils :Je marche en ====");
    }

    public String getPrenom() {
        return prenom;
    }
}
