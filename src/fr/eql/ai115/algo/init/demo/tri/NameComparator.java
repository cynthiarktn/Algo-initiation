package fr.eql.ai115.algo.init.demo.tri;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getNom().compareTo(s2.getNom());
    }
    // on a pas besoin de réécrire grâce à la méthode compareTo()
    // String implémente comparable donc il sait déjà comment trier les Strings
}
