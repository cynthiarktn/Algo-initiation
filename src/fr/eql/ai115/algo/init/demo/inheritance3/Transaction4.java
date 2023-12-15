package fr.eql.ai115.algo.init.demo.inheritance3;

public class Transaction4 {

    public void execute (int x, int y, IAlpha alpha){
        System.out.println("Transaction Result = "  +
                alpha.operation(x,y));
    }
}