package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP3 {
    public static void main(String[] args) {

        int value = Integer.parseInt(JOptionPane.showInputDialog("Saisissez un nombre entier"));
        if (value % 2 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Le résultat est : " + value / 2);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Le résultat est : " + (value * 3 + 1));
        }
    }
}
