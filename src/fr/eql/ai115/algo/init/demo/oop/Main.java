package fr.eql.ai115.algo.init.demo.oop;

public class Main {
    public static void main(String[] args) {
        Dossier dossier1 = new Dossier(1,"Pdf","Jean");
        System.out.println(dossier1);
        Dossier dossier2 = new Dossier(1,"java","Michel");
        System.out.println(dossier2);
        Dossier dossier3 = dossier2;
        System.out.println(dossier3);

        if (dossier1 == dossier2){
            System.out.println("dossier1 et dossier2 : pointent sur le même objet");
        } else {
            System.out.println("dossier1 et dossier2 : ne pointent pas sur le même objet");
        }

        if (dossier2 == dossier3){
            System.out.println("dossier2 et dossier3 : pointent sur le même objet");
        } else {
            System.out.println("dossier2 et dossier3 : ne pointent pas sur le même objet");
        }

        if (dossier1.equals(dossier2)){ // dossier2 devient obj de type objet dans le dossier
            // on peut modifier la télécommande pour la transformer en télécommande type dossier
            System.out.println("dossier1 et dossier2 : représentent le même objet");
        } else {
            System.out.println("dossier1 et dossier2 : ne représentent pas le même objet");
        }
    }
}
