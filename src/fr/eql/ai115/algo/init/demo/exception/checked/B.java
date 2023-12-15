package fr.eql.ai115.algo.init.demo.exception.checked;

public class B {
    C c = new C();
    public void mb(){
        System.out.println("Début B");

        try {
            c.mc(); // rien ne dit que c'est une exception
        } catch (MyException e) {
            System.out.println(e.getMessage()); // on aura plus besoin de faire try catch si il y a le runtime
        }

        // le runtime on est pas obligé de gérer ou de prévenir l'appelant
        System.out.println("Fin B");
    }
}
