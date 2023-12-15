package fr.eql.ai115.algo.init.demo.oop;

public class Dog {

    // variable d'instance
    private String name = "Toto";

    private int age = 5;

    private float size;

    private float weight;

    public String getName(){
        return this.name; // permet de lire l'attribut
    }

    public void setName(String name){
        this.name = name; // permet de modifier l'attribut
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Dog(String nom){

        name = nom;
    } // initialise les variables d'instance

    public Dog(String nom, int age){
        this(nom); //appelle le constructeur qui prend un argument
        this.age = age; // rappelle l'âge en privée
    }

    public Dog(float size) {
        this.size = size;
    }


    public void bark(){
        System.out.println("Je m'appelle " + name);
    }

    public String print() {
        return "Je m'appelle "+name+", j'ai "+age+" ans";
    }

    public Dog(String nom, int age, float size, float weight){
        name = nom;
        this.age = age; // rappelle l'âge en privée
        this.size = size;
        this.weight = weight;
    }

    public String message() {
        return "Je m'appelle "+name+", j'ai "+age+" ans. Je mesure " +size+
                " cm et je pèse "+ weight+ " kilos." ;
    }

    public void fetchBall(int times){
        bark(); // on peut appeler cette méthode
        System.out.println("Je rapporte "+times+" fois la balle");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}

