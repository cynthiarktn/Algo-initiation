package fr.eql.ai115.algo.init.demo.TP.gestioneleves;

import java.util.ArrayList;
import java.util.List;

public class Eleve implements Comparable<Eleve>{

    private String nom;
    private List<Integer> notes = new ArrayList<>();
    private double moyenne;

    public void ajouterNote(Integer note){
        int nbNotes = notes.size();
        // cas note < 0
        if (note<0){
            note =0;

        // cas note > 0
        } else if (note>20){
            note = 20;
        }
        // calcul moyenne maj = (moyenne * nbNotes + note) / (nbNotes +1)

        moyenne = (moyenne * nbNotes + note) / (nbNotes +1);
        //ajouter note
        notes.add(note);
        }

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return nom + " (" + moyenne + ")";
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        if (this.getMoyenne() < autreEleve.getMoyenne()) return -1;
        if (this.getMoyenne() == autreEleve.getMoyenne()) return 0;
        else return 1;
    }
}
