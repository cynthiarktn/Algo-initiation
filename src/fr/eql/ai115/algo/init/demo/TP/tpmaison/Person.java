package fr.eql.ai115.algo.init.demo.TP.tpmaison;

public class Person {
    private String name;
    private House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void display(){
        System.out.println("Je m'appelle " + name);
        house.display();
        house.getDoor();
    }
}
