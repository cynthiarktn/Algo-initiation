package fr.eql.ai115.algo.init.demo.TP.tpcomptable;

public class Comptable {

    private int tauxHoraire;

    public Comptable(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public int calculSalaire (int nbHeures){
        return tauxHoraire * nbHeures;
    }

    public double calculSalaire (int nbHeures, String type){
        if (type.equals("Cadre")) {
            return calculSalaire(nbHeures) * 1.1;
        }
        else  {
            return calculSalaire(nbHeures) * 1.4;
        }
    }

}

