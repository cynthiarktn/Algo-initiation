package fr.eql.ai115.algo.init.demo.enums.dogbreed;

public class Demo {
    public static void main(String[] args) {
        DogBreed breed;

        System.out.println("*** Affectation d'une variable de type enum ");
        breed = DogBreed.MINIATURE_SCHNAUZER;

        // Un System.out.print（ effectuera implicitement l'appel à La methode toString () de l'objet qui lui est donné.

        System.out.println ("Valeur de la variable : " + breed.getLabel());

        System.out.println ("\r\n *** Transformer une string en valeurs d'énumération ***");
        breed = DogBreed.valueOf("BEAGLE");
        System.out.println("Valeur de la variable : " + breed.getLabel());

        System.out.println("\r\n *** Afficher toutes les valeurs d'une enumeration ***");
        DogBreed[] breeds = DogBreed.values();
        for (DogBreed db : breeds) {
            System.out.println(db.getLabel());
        }

        System.out.println("\r\n *** Afficher L'index d'une valeur d'énumération ***");
        breed = DogBreed.POODLE;
        System.out.println("Index de la valeur : " + breed.ordinal());

        System.out.println("\r\n Récupérer une valeur d'énumération par son index ***");
        System.out.println (DogBreed.values()[2].getLabel());
    }
}
