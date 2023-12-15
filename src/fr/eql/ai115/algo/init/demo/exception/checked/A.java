package fr.eql.ai115.algo.init.demo.exception.checked;

public class A {
    B b = new B();
    public void ma(){
        System.out.println("Début A");
        b.mb();
        System.out.println("Fin A");
    }
}
