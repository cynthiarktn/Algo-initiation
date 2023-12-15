package fr.eql.ai115.algo.init.demo.lambda2;

@FunctionalInterface // il n'y a qu'une méthode dans cette interface
public interface Rule {
    boolean canOperate(double a, double b);
}
