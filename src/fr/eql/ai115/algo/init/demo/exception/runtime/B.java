package fr.eql.ai115.algo.init.demo.exception.runtime;

public class B {
    C c = new C();
    public void mb(){
        System.out.println("Début B");
        try {
            c.mc(); // rien ne dit que c'est une exception
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin B");
    }
}
