package fr.eql.ai115.algo.init.demo.axel;

public class _3_demoarithmetics {
    public static void main(String[] args) {
        int number1, number2, result1; // on peut affecter dans la déclaration
        float number3, number4, result2;

        number1 = 7;
        number2 =2;

        System.out.println("\r\n*** Additions ***");
        result1 = number1 + number2;
        System.out.println(number1+ "+" + number2 + "=" + result1);
        result1++; // équivaut à une incrémentation result1 = result1 + 1; on peut aussi l'écrire ++result1;
        System.out.println("Et plus 1 : " + result1);
        result1 += number1; // équivaut à result1 = result1 + number1;
        System.out.println("Et plus 1" + number1 + ":" + result1);

        System.out.println("\r\n*** Soustractions ***");
        result1 = number1 - number2;
        System.out.println(number1+ "-" + number2 + "=" + result1);
        result1--; // équivaut à une décrémentation result1 = result1 - 1; on peut aussi l'écrire --result1;
        System.out.println("Et moins 1 : " + result1);
        result1 -= number1; // équivaut à result1 = result1 - number1;
        System.out.println("Et moins 1" + number1 + ": " + result1);

        System.out.println("\r\n*** Multiplications ***");
        result1 = number1 * number2;
        System.out.println(number1+ "*" + number2 + "=" + result1);
        result1 *= number1; // équivaut à result1 = result1 * number1;
        System.out.println("Et multiplié par " + number1 + ": " + result1);

        number3 = 7f;
        number4 = 2f;

        System.out.println("\r\n*** Divisions ***");
        result2 = number3 / number4;
        System.out.println(number3+ "/" + number4 + "= " + result2);
        result2 /= number3; // équivaut à result2 = result2 / number3;
        System.out.println("Et divisé par " + number3 + ": " + result2);

        /*
        Division euclidienne (entière)
        7 / 2 = 3.5
        7 / 2 = 3 + 0.5
        7 = (3*0.5) * 2
        7 = 3 * 2 + 0.5 * 2
        7 = 3 * 2 + 1

        7 : dividende
        2 : diviseur
        3 : quotient
        1 : reste
        */

        System.out.println("\r\n*** Quotient de divisions entières ***");
        result1 = number1 / number2;
        System.out.println("Le quotient de la division entière entre "
            + number1 + " et " + number2 + " est " + result1);

        System.out.println("\r\n*** Reste de divisions entières ***");
        result1 = number1 % number2;
        System.out.println("Le reste de la division entière entre "
                + number1 + " et " + number2 + " est " + result1);

        System.out.println("\r\n*** Incrémentation et exécution concomitantes ***"); // se déroule en même temps
        int i = 0;
        System.out.println("i : " + i);
        System.out.println("i++ : " + i++); // affiche puis incrémente
        System.out.println("i : " + i);

        i = 0;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // incrémente puis affiche
        System.out.println("i : " + i);
    }
}
