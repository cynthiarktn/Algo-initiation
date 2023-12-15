package fr.eql.ai115.algo.init.demo.exercice;

public class Chassis{
    private double poidsChassis;

    public Chassis() {
        this(120);
    }

    public Chassis(double poidsChassis) {
        this.poidsChassis = poidsChassis;


    }
    public void affiche(){
        //infos chassis
        System.out.println();
        System.out.println(	"Infos Carrosserie");
        System.out.println(	"Poids: " + poidsChassis);
    }

    public double getPoidsChassis() {
        return poidsChassis;
    }
}
