package fr.eql.ai115.algo.init.demo.oop;

public class Demo {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Titi"); // new crée l'objet qui est en mémoire
        // new dog retourne une télécommande (référence)
        // qui sera stockée dans la variable qui se nomme Dog
        Dog dog2 = new Dog("Toto");
        dog1.bark(); // on appelle la fonction bark
        dog2.bark(); // on appelle la fonction bark

        Dog dog3 = new Dog("Axel",12);
        String msg = dog3.print();
        System.out.println(msg);

        Dog dog4 = new Dog("Mikkie",2,60f,5f);
        //par défaut c'est double donc on met f pour lui dire que c'est float
        dog4.message();

        dog4.fetchBall(10);
        System.out.println( dog4.getName());
        dog4.setName("Coco");
        System.out.println(dog4.getName());
    }
}
