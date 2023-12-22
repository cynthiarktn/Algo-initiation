package fr.eql.ai115.algo.init.demo.TP.tplivres;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre(1, "Soleil", 1956, 1956, 12.5));
        livres.add(new Livre(2, "Soleil", 1956, 2005, 12.5));
        livres.add(new Livre(3, "Lune", 2005, 2008, 15.9));
        livres.add(new Livre(4, "Mars", 2020, 2020, 24.2));
        livres.add(new Livre(4, "Mars", 2020, 2005, 24.2));

//        Library3 library3 = new Library3();
//        List<Livre> results = library3.search(livres, new AnneePublication(), "2020");
//        System.out.println(results);

        Library3 library3 = new Library3();
        List<Livre> results = library3.search(livres, new AnneeEdition(), "2005");
        List<Livre> multiCriteres = library3.search(results, new AnneePublication(),"2020");

        System.out.println(multiCriteres);

    }
}
