package fr.eql.ai115.algo.init.demo.lambda;

public class Demo4 {
    public static void main(String[] args) {
        Executor add = (num1,num2) -> num1+num2; // enlève les accolades s'il n'y qu'une seule instruction
        System.out.println("a + b = " + add.operation(12,25));

        Executor multiply = (num1,num2) -> num1*num2; // enlève les accolades s'il n'y qu'une seule instruction
        System.out.println("a x b = " + multiply.operation(12,25));
    }
}
// bifunction prend deux entrées et une sortie ce qui va encore simplifier dans demo 5, on aura plus besoin d'appeler l'interface