package fr.eql.ai115.algo.init.demo.inheritance3;

public class Transaction1{
    IAlpha alpha;

    public Transaction1(IAlpha alpha){
        this.alpha =alpha;
    }



    public void execute (int x, int y){
        System.out.println("Transaction Result = " + alpha.operation(x,y));
    }
}
