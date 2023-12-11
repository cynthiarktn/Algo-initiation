package fr.eql.ai115.algo.init.demo.TP.tp1;

public class Main {
    public static void main(String[] args) {

        Calculateur casio = new Calculateur(); // création d'un objet pour avoir accès à la classe

        System.out.println("a + b = " + casio.add(5,6));
        System.out.println("a - b = " + casio.sub(5,2));
        System.out.println("a / b = " + casio.div(2f,9f));
        System.out.println("a * b = " + casio.mul(6,8));
    }
}
