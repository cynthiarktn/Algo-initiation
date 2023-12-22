package fr.eql.ai115.algo.init.demo.TP.tpfichier;

import fr.eql.ai115.algo.init.demo.inheritance1.Fille;

public class Demo2 {

    public static void main(String[] args) {
        MyFile file = new MyFile();
        file.setState(new InUse());
        file.lecture();
    }
}
