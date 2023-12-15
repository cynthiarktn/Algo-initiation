package fr.eql.ai115.algo.init.demo.inheritance2;

public class MyWeb extends Web{
    @Override
    public String doGet() {
        return "Message Get to Browser";
    }

    @Override
    public String doPost() {
        return "Message Post to Browser";
    }
}