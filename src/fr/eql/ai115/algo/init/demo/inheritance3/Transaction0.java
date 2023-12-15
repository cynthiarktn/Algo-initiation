package fr.eql.ai115.algo.init.demo.inheritance3;

public class Transaction0 {
    IAlpha alpha = new Addition();

    public void execute (int x, int y){
        System.out.println("Transaction Result = " + alpha.operation(x,y));
    }
}