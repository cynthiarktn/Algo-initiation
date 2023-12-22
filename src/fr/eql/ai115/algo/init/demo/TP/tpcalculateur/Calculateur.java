package fr.eql.ai115.algo.init.demo.TP.tpcalculateur;

public class Calculateur {

    public int add (int a, int b){
        return a+b;
        // on peut aussi écrire
        // int sum = a+b
        // return sum
    }

    public int sub (int a, int b){
        return a-b;
    }

    public int mul (int a, int b){
        return a*b;
    }

    public float div (float a, float b){
        if (b!=0) return a/b;
        else return 0;
    }
}
