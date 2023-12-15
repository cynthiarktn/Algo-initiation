package fr.eql.ai115.algo.init.demo.lambda;

public class Demo1 {
    public static void main(String[] args) {
        Executor add = new Add();
        System.out.println("a + b = " + add.operation(12,25));

        Executor multiply = new Multiply();
        System.out.println("a + b = " + multiply.operation(12,25));


    }
}

