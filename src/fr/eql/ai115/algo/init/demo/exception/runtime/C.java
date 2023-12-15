package fr.eql.ai115.algo.init.demo.exception.runtime;

public class C {
    public void mc(){
        System.out.println("Début C");

//        try { // on teste ça
            int a = 12;
            int b = Math.random() <0.3 ? 0:3;
            int c = a/b;
            System.out.println("Div = " + c); // si c'est bon on continue
//        } catch (ArithmeticException e){ // sinon, on fait cette exception pour qu'il n'y ait pas d'erreur
//            System.out.println(e.getMessage());
//        }

        System.out.println("Fin C");
    } // dès qu'il y a une erreur la suite ne se traite pas
    // c'est pourquoi on crée des exceptions et des runtime exception
}
