package fr.eql.ai115.algo.init.demo.inheritance1;

public class Fille extends Pere{

    private String prenom;

    public Fille(String nom) {
        super(nom);
        this.prenom = prenom;
    }

    @Override
    public void parler() {
        super.parler();
        System.out.println("Fille : Je parle espagnol");
    }

    @Override
    public void marcher() {
        super.marcher();
        System.out.println("Fille :Je marche en ---------");
    }

    public void courir(){

    }
}
