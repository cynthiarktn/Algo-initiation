package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP2 {
    public static void main(String[] args) {

        // Déterminer si le nombre est pair ou impair

        int value = Integer.parseInt(JOptionPane.showInputDialog("Saisissez un nombre entier"));
        if (value % 2 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Votre nombre est pair.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Votre nombre est impair.");
        }
    }
}
