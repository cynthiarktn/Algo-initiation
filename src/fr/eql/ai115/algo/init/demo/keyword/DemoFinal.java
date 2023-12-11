package fr.eql.ai115.algo.init.demo.keyword;

import fr.eql.ai115.algo.init.demo.oop.Dog;

public class DemoFinal {
    public static void main(String[] args) {
        // final veut dire que ça ne peut pas être changé mais peut être placé devant bcp de choses
        final int number;
        number = 12;

        System.out.println(number);

        // number=0; // comme il n'est pas pareil que le final il ne fonctionne plus

        // on va donc mettre final dans une référence
        final Dog dog; // final est mis que sur la référence et non sur la variable = c'est donc constant
        dog = new Dog("Milou", 5,50,10);
        System.out.println(dog.getName());
        dog.setName("Fido");
        System.out.println(dog.getName());

        // dog = new Dog("Titi"); ne fonctionne pas, il faut le faire avec setName si on veut modifier la valeur

    }
}
