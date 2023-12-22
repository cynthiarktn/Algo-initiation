package fr.eql.ai115.algo.init.demo.TP.tpmaison;

public class Apartment extends House{
    public Apartment(int surface) {
    }

    public Apartment(Door door) {
        super(door);
        setSurface(50);
    }

    @Override
    public void display(){
        System.out.println("Je suis un appartement, ma surface est de " + getSurface() + " m²");
    }
}
