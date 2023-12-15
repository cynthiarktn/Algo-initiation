package fr.eql.ai115.algo.init.demo.inheritance1;

public class Main {
    public static void main(String[] args) {

        Fils fils = new Fils("Martin","Jean");
        fils.parler();
        fils.marcher();
        System.out.println(fils.getPrenom()); // vient de fils
        System.out.println(fils.getNom()); // vient du père

//        Pere[] peres = new Pere[4]; // tableau de 4 peres
//        peres[0] = new Fils();
//        peres[1] = new Fille();
//        peres[2] = new Fils();
//        peres[3] = new Fille();
//
//        for (Pere p:peres) {
//            p.parler();
//            p.marcher();
//        }
    }
}
