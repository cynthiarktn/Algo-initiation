package fr.eql.ai115.algo.init.demo.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100,23, "Jean"));
        students.add(new Student(101,27, "Henry"));
        students.add(new Student(102,21, "Marie"));

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("===========Tri par âge par ordre croissant==========");

        // on va trier les données dans la liste
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
