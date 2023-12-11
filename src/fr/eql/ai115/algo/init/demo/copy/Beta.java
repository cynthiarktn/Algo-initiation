package fr.eql.ai115.algo.init.demo.copy;

public class Beta {

    public void change (Alpha alpha1, String nom){
        alpha1.setNom(nom); // pointe sur le même objet que alpha = passage par référence
    }
}
