package fr.eql.ai115.algo.init.demo.inheritance3;

import fr.eql.ai115.algo.init.demo.copy.Alpha;

public class Main {
    public static void main(String[] args) {
//        IAlpha op1 = new Addition();
//        System.out.println("a + b = "+ op1.operation(2,4));
//
//        IAlpha op2 = new Multiply();
//        System.out.println("a x b = "+ op2.operation(6,7)) ;

//        IAlpha op = null;
//
//        if (Math.random()<0.5){
//            op= new Addition();
//        }else {
//            op=new Multiply();
//        }
//        System.out.println("Result = " + op.operation(2,5));

        IAlpha alpha = new Multiply();

        // Les 4 manières pour faire communiquer les classes

        System.out.println("=====0 avec new=====");
        Transaction0 transaction0 = new Transaction0();
        transaction0.execute(4,5);

        System.out.println("=====1 avec constructeur=====");
        Transaction1 transaction1 = new Transaction1(alpha);
        transaction1.execute(4,5);

        // Les plus flexibles
        System.out.println("=====2 avec setter =====");
        Transaction2 transaction2 = new Transaction2();
        transaction2.setAlpha(new Addition());
        transaction2.execute(4,5);
        transaction2.setAlpha(new Multiply());
        transaction2.execute(4,5);


        System.out.println("=====4 une seule méthode =====");
        Transaction4 transaction4 = new Transaction4();
        transaction4.execute(4,5, new Multiply());
    }
}
