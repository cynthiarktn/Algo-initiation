package fr.eql.ai115.algo.init.demo.TP.animaux;

public class MainAnimaux {
    public static void main(String[] args) {

        Criant[] tab = new Criant[4];
        tab[0] = new Chats();
        tab[1] = new Chiens();
        tab[2] = new Chats();
        tab[3] = new Chiens();
        for (int i=0; i<4; i++){
            tab[i].crier();
        }
    }
}
