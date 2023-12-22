package fr.eql.ai115.algo.init.demo.TP.tplivres;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre(1, "Soleil", 1956, 1956, 12.5));
        livres.add(new Livre(2, "Soleil", 1956, 2005, 12.5));
        livres.add(new Livre(3, "Lune", 2005, 2008, 15.9));
        livres.add(new Livre(4, "Mars", 2020, 2020, 24.2));
        livres.add(new Livre(4, "Mars", 2020, 2005, 24.2));

        Library2 library2 = new Library2();
        List<Livre> results = library2.searchPublication(livres,2020);
        System.out.println(results);

    }

}
