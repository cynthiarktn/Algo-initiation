package fr.eql.ai115.algo.init.demo.TP.tpmap;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.HashMap;
import java.util.Map;

public class DemoMapPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne(25,"Jeannot", "Lola");
        Personne personne2 = new Personne(26,"Poilante", "Bobby");
        Personne personne3 = new Personne(27,"Misere", "Paul");

        //Ici l'id est la clé et les valeurs sont les détails dans la classe personne
        Map<Integer, Personne> personneMap = new HashMap<>();
        personneMap.put(personne1.getId(), personne1);
        personneMap.put(personne2.getId(), personne2);
        personneMap.put(personne3.getId(), personne3);
        personneMap.get(25).setNom("Polila");

        for (Map.Entry<Integer, Personne> p : personneMap.entrySet()) {
            System.out.println(p.getKey() + "--" + p.getValue().getPrenom());
        }

    }

}
