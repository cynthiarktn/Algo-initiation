package fr.eql.ai115.algo.init.demo.TP.tpmaison;

public class House {

    private int surface;
    private Door door;

    public House() {}

    public House(int surface, Door door) {
        this.surface = surface;
        this.door = door;
    }

    public House(Door door) {
        this.door = door;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m².");
    }

    public void getDoor(){
        door.display();
    }
}