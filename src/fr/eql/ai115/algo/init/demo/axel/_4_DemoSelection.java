package fr.eql.ai115.algo.init.demo.axel;

public class _4_DemoSelection {
    public static void main(String[] args) {
        int x = 1;

        System.out.println("\r\n*** Condition avec opérateur OU (||) ***");
        if (x == 1 || x >= 1000) { // équivaut à then
            System.out.println("Au moins une des deux conditions est remplie.");
        } else {
            System.out.println("Aucune des deux conditions n'est remplie.");
        }

        System.out.println("\r\n*** Condition avec opérateur OU EXCLUSIF (^) ***");
        if (x == 1 ^ x <= 1000) {
            System.out.println("Une seule des deux conditions est remplie.");
        } else {
            System.out.println("Les deux conditions sont remplies, ou aucune.");
        }

        System.out.println("\r\n*** Condition avec opérateur ET (&&) ***");
        if (x == 1 && x >= 1000) {
            System.out.println("Les deux conditions sont remplies.");
        } else if (x <= 2){
            System.out.println("Une condition alternative est remplie.");
        } else {
            System.out.println("Ni la première, ni la deuxième série de conditions ne sont remplies.");
        }

        System.out.println("\r\n*** Négation d'une condition multiple (Lois de Morgan) ***");
        boolean isTrue, isAlsoTrue;

        System.out.println("\r\n--- Négation avec OU ---");
        /*
         * La négation de la disjonction de deux propositions est équivalente
         * à la conjonction des négations des deux propositions, ce qui
         * signifie que :
         * non(A ou B) est identique à (non A) et (non B).
         */
        isTrue = !(x == 0 || x != 1); // !() veut dire l'inverse de
        isAlsoTrue = !(x == 0) && !(x != 1);
        if (isTrue && isAlsoTrue) {
            System.out.println("Les deux conditions équivalente sont remplies.");
        } else {
            System.out.println("Aucune des deux conditions n'est remplie, ou elles ne sont pas équivalentes.");
        }

        System.out.println("\r\n--- Négation avec ET ---");
        /*
         * La négation de la conjonction de deux propositions est équivalente
         * à la disjonction des négations des deux propositions, ce qui
         * signifie que :
         * non(A et B) est identique à (non A) ou (non B).
         */

        isTrue = !(x == 1 && x >= 1000);
        isAlsoTrue = !(x == 1) || !(x >= 1000);
        if (isTrue && isAlsoTrue) {
            System.out.println("Les deux conditions équivalente sont remplies.");
        } else {
            System.out.println("Aucune des deux conditions n'est remplie, ou elles ne sont pas équivalentes.");
        }

        System.out.println("\r\n*** Opérateurs logiques et bit à bit ***");
        String error = null; // null pour les exceptions
        /*
        error.isEmpty() renvoie une exception si error est 'null'.
        Opérateur logique OU : Si la première condition est remplie,
        alors la deuxième n'est pas testée.
        */
        if (x == 1 || error.isEmpty()) {
            System.out.println("OU : la deuxième condition n'est pas testée.");
        }

        // Opérateur bit à bit : Les deux propositions sont comparées entre elles
//        System.out.println("Une exception va être générée ici.");
//        if (x == 1 | error.isEmpty()) {
//            System.out.println("Ce code ne sera pas lu.");
//        }

        // Opérateur logique ET : Si la 1ʳᵉ condition n'est pas remplie, alors la 2ᵉ n'est pas testée.
        if (x != 1 && error.isEmpty()) {

        }
        System.out.println("ET : la deuxième condition n'est pas testée.");

        // Opérateur bit à bit : Les deux propositions sont comparées entre elles
        System.out.println("Une exception va être générée ici.");
        if (x != 1 & error.isEmpty()) {
            System.out.println("Ce code ne sera pas lu.");
        }
    }
}
