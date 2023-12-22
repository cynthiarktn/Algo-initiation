package fr.eql.ai115.algo.init.demo.TP.tpfichier;

public class MyFile {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void lecture(){
        state.lecture();
    }
}
