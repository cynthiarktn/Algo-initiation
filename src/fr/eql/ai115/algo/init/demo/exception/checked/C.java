package fr.eql.ai115.algo.init.demo.exception.checked;

public class C {
    public void mc() throws MyException {
        // on déclare l'exception qui peut arriver dans le début de la méthode
        // sauf si c'est un runtime
        System.out.println("Début C");
        if (Math.random() < 0.3) {
            throw new MyException("Problème de traitement");
        }else {
            System.out.println("Traitement OK ");
        } // une chance sur 3 d'avoir traitement OK



        System.out.println("Fin C");
    } // dès qu'il y a une erreur la suite ne se traite pas
    // c'est pourquoi on crée des exceptions et des runtime exception
}
