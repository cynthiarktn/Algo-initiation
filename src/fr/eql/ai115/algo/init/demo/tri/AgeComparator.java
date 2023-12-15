package fr.eql.ai115.algo.init.demo.tri;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    // on va comparer deux critères externes
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge()) return 0;
        else if (s1.getAge() > s2.getAge()) return 1;
        else return -1;
    }
}
