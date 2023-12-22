package fr.eql.ai115.algo.init.demo.TP.tpmaison;

public class Demo {
    public static void main(String[] args) {
        Person thomas = new Person("Thomas", new Apartment(new Door("jaune")));
        thomas.display();
    }
}
