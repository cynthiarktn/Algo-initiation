package fr.eql.ai115.algo.init.demo.string;

public class Demo {
    public static void main(String[] args) {

        String sentence = "Hello World";
        String emptySentence = "";

        // Obtenir le nombre de caractères d'une chaîne de caratères
        System.out.println("\r\n--- Obtenir la taille (nombre de caractères) ---");
        System.out.println("sentence : " + sentence.length());

        // Vérifier si la chaîne de caratères est vide
        System.out.println("\r\n--- Vérifier si la chaîne est vide ---");
        System.out.println("sentence : " + sentence.isEmpty());

        // Afficher un morceau de la chaîne de caractères
        System.out.println("\r\n--- Obtenir une partie de la chaîne ---");
        System.out.println("sentence (à partir du 5ème caractère inclus (index 4)) : "
                + sentence.substring(4)); // l'index est non inclus
        // il commence au 5e caractère

        System.out.println("sentence (à partir du 5ème caractère inclus jusqu'au 8ème non inclus) : "
                + sentence.substring(4,7));// le premier est non inclus et le deuxième inclus

        // overloading : méthodes

        // Remplacement en minuscules et majuscules
        System.out.println("\r\n--- Changer la casse ---");
        System.out.println("sentence en minuscules : " + sentence.toLowerCase());
        System.out.println("sentence en majuscules : " + sentence.toUpperCase());

        // Suppression des espaces vides
        System.out.println("\r\n--- Retirer les espaces qui entourent la chaîne ---");
        String sentenceWithSurroundingSpaces = "            toto titi                ";
        String trimmedSentence = sentenceWithSurroundingSpaces.trim();
        System.out.println("Taille de trimmedSentence : " + trimmedSentence.length());

        // Remplacement d'une châine de caractères avec une autre
        System.out.println("\r\n--- Remplacer une partie de la chaîne par une autre ex : World - Toto ---");
        String replacedSentence = sentence.replace("World","Toto");
        System.out.println(replacedSentence);

        /*
        Un StringBuffer (ou StringBuilder) permet entre autres de concaténer
        des chaînes de caractères de manière plus performante qu'une
        concaténation classique.
         */
        String part1 = "Hello";
        String part2 = "World";
        String part3 = "!";

        System.out.println("\r\n--- Concaténation classique ---");
        String allParts = part1 + " " + part2 + " " + part3;
        System.out.println(allParts);

        // S'il y a beaucoup de concaténations, il y a bcp d'objets en mémoire et donc moins de performance
        // C'est pourquoi java a créé des objets spécialisés pour la concaténation

        StringBuffer myBuffer = new StringBuffer();
        myBuffer
                .append(part1)
                .append(part2)
                .append(part3)
                .insert(part1.length()," ")
                .insert(part1.length() + part2.length() + 1, " ");
        allParts = myBuffer.toString();
        System.out.println(allParts);

        System.out.println("\r\n### Comparaisons entre deux chaînes de caractères identiques ###");

        String a = new String("toto");
        String b = new String("toto");

        System.out.println(a.equals(b));

        System.out.println("\r\n*** Entre deux littéraux ***");



        System.out.println("--- Objets (emplacement en mémoire) ---");
        System.out.println(a==b);
    }
}
