package fr.eql.ai115.algo.init.demo.TP.tp4;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre(1, "Soleil", 1956, 1956, 12.5));
        livres.add(new Livre(2, "Soleil", 1956, 2005, 12.5));
        livres.add(new Livre(3, "Lune", 2005, 2008, 15.9));
        livres.add(new Livre(4, "Mars", 2020, 2020, 24.2));
        livres.add(new Livre(4, "Mars", 2020, 2005, 24.2));

        Library1 library1 = new Library1();
        List<Livre> results = library1.search(livres,2005);
        System.out.println(results);

    }

}
