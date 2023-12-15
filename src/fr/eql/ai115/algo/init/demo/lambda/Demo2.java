package fr.eql.ai115.algo.init.demo.lambda;

public class Demo2 {
    public static void main(String[] args) {
        Executor add = new Executor() {
            @Override
            public int operation(int num1, int num2) {
                return num1+num2;
            } // on a directement le corps de la méthode
        };

        System.out.println("a + b = " + add.operation(12,25));

        Executor multiply = new Executor() {
            @Override
            public int operation(int num1, int num2) {
                // c'est redondant pour le compilateur de remettre les mêmes informations
                // on va donc simplifier la ligne dans Demo3
                return num1*num2;
            } // on a directement le corps de la méthode
        };

        System.out.println("a x b = " + multiply.operation(12,25));
    }
}
