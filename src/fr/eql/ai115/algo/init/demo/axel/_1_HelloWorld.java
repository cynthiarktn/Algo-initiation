package fr.eql.ai115.algo.init.demo.axel;

public class _1_HelloWorld {

    public static void main(String[] args) {

        // Impression simple
        System.out.print("Hello World !"); // System est un objet, point virgule = fin d'instruction
        // une app java doit se fermer avec exit code 0

        // Impression avec saut de ligne
        System.out.println("Hello world !"); // raccourci sout

        /*
        Saut de ligne :
        Windows : CR (carriage return = revenir au début de la ligne) + LF (line feed = nouvelle ligne) -> \r\n (commande)
        Linux : LF -> \n
        Mac : \r
         */
        System.out.println("Goodbye \r\n World");
        System.out.println("Goodbye \r World");
        System.out.println("Goodbye \n World");
        // sélectionner le mot à mettre entre guillemets et appuyer sur les guillemets et ctrl D pour dupliquer la ligne

        // Tabulation
        System.out.println("\t Hello again");
    }
}
