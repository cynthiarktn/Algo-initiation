package fr.eql.ai115.algo.init.demo.TP.tpmaison;

public class Door {
    protected String color;

    public Door(String color) {
        this.color = color;
    }

    public Door() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("Je suis une porte ma couleur est " + color);
    }
}
