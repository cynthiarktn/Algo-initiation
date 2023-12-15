package fr.eql.ai115.algo.init.demo.lambda;

public class Add implements Executor{
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}
