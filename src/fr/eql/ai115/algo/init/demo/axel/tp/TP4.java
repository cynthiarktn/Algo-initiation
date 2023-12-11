package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP4 {

    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog("Quel est l'âge de votre enfant ?"));
        if (age < 6) {
            JOptionPane.showMessageDialog(null,
                    "Votre enfant est hors catégorie.");
        } else if (age == 6 || age == 7) {
            JOptionPane.showMessageDialog(null,
                    "Votre enfant est en catégorie poussin");
        } else if (age == 8 || age == 9) {
            JOptionPane.showMessageDialog(null,
                    "Votre enfant est en catégorie pupille");
        } else if (age == 10 || age == 11) {
            JOptionPane.showMessageDialog(null,
                    "Votre enfant est en catégorie poussin");
        } else if (age <= 12) {
            JOptionPane.showMessageDialog(null,
                    "Votre enfant est en catégorie cadet");
        }
    }
}
