package fr.eql.ai115.algo.init.demo.collection;

public class DemoArray {
    public static void main(String[] args) {
        // Initialisation et peuplement d'un tableau à une dimension
        String[] seasons = {"Printemps", "Eté", "Automne", "Hiver"};

        System.out.println("*** Lecture du 3ème élément du tableau (index 2) ***");
        System.out.println(seasons[2]);

        System.out.println("\r\n*** Lecture de tous les éléments du tableau ***");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println("==============");
        for (String s : seasons) { // pour tout élément qui est dans seasons est s de type string
            System.out.println(s); // afficher tous les s
        }

        // Premier type d'ensemble : les listes

    }
}
