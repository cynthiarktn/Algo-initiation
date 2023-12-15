package fr.eql.ai115.algo.init.demo.wrapper;

import fr.eql.ai115.algo.init.demo.oop.Dossier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        /*Les équivalents objets des primitifs
         * byte -> Byte
         * int -> Integer
         * float -> Float
         * double -> Double
         * boolean -> Boolean
         * char -> Character
         * long -> Long
         * short -> Short
         */

        Integer myInt = null;
        myInt = new Integer("12");

        int a=myInt.intValue();
        System.out.println(a);

        Integer myInt2 = new Integer(12);
        int b = new Integer(20);
        Integer c = 12;

        List<Integer> myIntList = new ArrayList<>();
        // elle ne peut contenir que des integer, on est obligé de mettre la version objet pour les listes
        myIntList.add(4);
        myIntList.add(7);
        myIntList.add(99);


        //  List <Object> bidon = new ArrayList<>(); et List bidon = new ArrayList<>(); veulent dire la même chose
        List bidon = new ArrayList<>();
        bidon.add(2);
        bidon.add(new Integer(12));
        bidon.add(true);

        List<Dossier> dossiers = new ArrayList<>();
        dossiers.add(new Dossier(1, "pdf", "jean"));
        dossiers.add(new Dossier(1, "pdf", "jean"));
        dossiers.add(new Dossier(4, "pdf", "jean"));
        dossiers.add(new Dossier(4, "pdf", "marc"));
        dossiers.add(new Dossier(6, "pdf", "marc"));

        for (Dossier d : dossiers) {
            System.out.println(d);
        }

        System.out.println("==============");

        Set <Dossier> dossierSet = new HashSet<>(); // set est le père de hashset
        dossierSet.add(new Dossier(4, "pdf", "jean"));
        dossierSet.add(new Dossier(1, "pdf", "jean"));
        dossierSet.add(new Dossier(4, "pdf", "marc"));
        dossierSet.add(new Dossier(1, "pdf", "jean"));
        dossierSet.add(new Dossier(6, "pdf", "marc"));

        for (Dossier d : dossierSet) {
            System.out.println(d);
        }



    }
}
