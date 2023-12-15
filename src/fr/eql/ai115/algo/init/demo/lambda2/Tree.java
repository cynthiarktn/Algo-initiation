package fr.eql.ai115.algo.init.demo.lambda2;

public class Tree implements Plant{
    @Override
    public void grow(int quantity) {
        System.out.println("Je fais pousser " + quantity + " arbre(s).");
    }
}
