package fr.eql.ai115.algo.init.demo.inheritance2;

public abstract class Web {
    public void connect(String url) {
        System.out.println("Connecting to ... " + url);
    }

    abstract public String doGet();


    abstract public String doPost ();
}
