package fr.eql.ai115.algo.init.demo.lambda;

import fr.eql.ai115.algo.init.demo.exception.checked.C;

public class Demo6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=====V1=====");
        Executor add = new Add();
        calculator.calcul(add,25,45);
        // on va utiliser l'executor add créé juste au dessus
        // en appelant la méthode calcul créée dans Calculator
        Executor multiply = new Multiply();
        calculator.calcul(multiply,25,45);

        System.out.println("=====V2=====");
        calculator.calcul(add,25,45);
        calculator.calcul(multiply,25,45);

        System.out.println("=====V3=====");
        calculator.calcul((num1,num2) -> num1+num2,25,45);
        calculator.calcul((num1,num2) -> num1*num2,25,45);



    }
}
