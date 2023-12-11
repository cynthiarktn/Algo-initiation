package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP1 {
    public static void main(String[] args) {
        int value = Integer.parseInt(JOptionPane.showInputDialog("Saisissez un nombre entier"));

        if (value > 0) {
            JOptionPane.showMessageDialog(null,
                    "Votre nombre est positif.");
        } else if (value < 0) {
            JOptionPane.showMessageDialog(null,
                    "Votre nombre est négatif.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Votre nombre est égal à 0.");
        }


    }
}
