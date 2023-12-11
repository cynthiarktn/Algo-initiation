package fr.eql.ai115.algo.init.demo.copy;

public class Main {
    public static void main(String[] args) {

        Alpha alpha=new Alpha("Jean");

        Alpha alpha13 = alpha;

        System.out.println(alpha13.getNom());
        System.out.println(alpha.getNom());
        alpha13.setNom("Henry");
        System.out.println(alpha.getNom());

        alpha13=null;
        alpha=null;

        System.out.println(new Alpha("Jean").getNom());

        Alpha alpha1=new Alpha("Jean");
        System.out.println(alpha1.getNom());
        Beta beta1=new Beta();
        beta1.change(alpha1,"Henry");
        System.out.println(alpha.getNom());

    }
}
