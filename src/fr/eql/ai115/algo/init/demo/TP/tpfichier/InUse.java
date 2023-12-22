package fr.eql.ai115.algo.init.demo.TP.tpfichier;

public class InUse implements State{
    @Override
    public void lecture() {
        System.out.println("Fichier en cours d'utilisation.");
    }
}
