package fr.eql.ai115.algo.init.demo.lambda;

public class Calculator {

    public void calcul (Executor executor, int a, int b){
        System.out.println("Calcul = " + executor.operation(a,b));
    }
}
