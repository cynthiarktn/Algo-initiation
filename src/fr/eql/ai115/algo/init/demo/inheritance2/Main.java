package fr.eql.ai115.algo.init.demo.inheritance2;

public class Main {
    public static void main(String[] args) {
        Web web = new MyWeb();
        web.connect("www.toto.fr");
        System.out.println(web.doGet());
    }
}
