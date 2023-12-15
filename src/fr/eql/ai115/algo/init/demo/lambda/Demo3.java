package fr.eql.ai115.algo.init.demo.lambda;

public class Demo3 {
    public static void main(String[] args) {
        // on crée donc des lambdas
        Executor add = (int num1, int num2) -> {return num1+num2;};
        // entre les accolades, c'est le corps de la méthode
        // il faut des entrées et des sorties en int
        // il n'y a pas d'ambiguïté pour le compilateur
        System.out.println("a + b = " + add.operation(12,25));

        Executor multiply = (int num1, int num2) -> {return num1*num2;}; // on sait déjà que c'est des int
        // donc on va encore simplifier en enlevant int s'il y a une seule instruction dans demo4
        System.out.println("a * b = " + multiply.operation(12,25));
    }
}
