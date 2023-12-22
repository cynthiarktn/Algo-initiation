package fr.eql.ai115.algo.init.demo.TP.etudiant;

public class Person {
    protected int age; // les héritiers ont accès à protected

    public void setAge(int n) {
        this.age = n;
    }

    public void sayHello(){
        System.out.println("Hello !");
    }
}
