package fr.eql.ai115.algo.init.demo.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100,23, "Jean"));
        students.add(new Student(101,27, "Henry"));
        students.add(new Student(102,21, "Marie"));

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("===========Tri de l'âge par ordre croissant==========");
        // on choisit le 2eme sort qui prend un comparateur on crée un nouveau comparateur
        Collections.sort(students,new AgeComparator());
        for (Student s : students) {
            System.out.println(s);
        }


        System.out.println("===========Tri du nom par ordre croissant==========");
        // on choisit le 2eme sort qui prend un comparateur on crée un nouveau comparateur
        Collections.sort(students,new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
