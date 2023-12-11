package fr.eql.ai115.algo.init.demo.keyword;

import java.security.spec.RSAOtherPrimeInfo;

public class DemoStatic {
    private int nonStaticNumber = 0 ; // variable d'instance doit toujours être en private,
    // il faut faire new et get pour y avoir accès

    public static  int staticNumber = 5; // variable de classe car c'est lié à la classe,
    // non lié à l'instance, on a accès sans avoir à faire new

    public static  int staticNumber2 = 10;

    static {
        System.out.println("dans bloc static" + (staticNumber+staticNumber2));
    }

    public int getNonStaticNumber() {
        return nonStaticNumber;
    }

    public int nonStaticAdd(int a, int b){
        return a+b;
    }

    static public int staticAdd(int a, int b){
        return a+b;
    }
}

