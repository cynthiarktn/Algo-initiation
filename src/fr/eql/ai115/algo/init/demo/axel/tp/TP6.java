package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP6 {

    public static void main(String[] args) {

        int value;
        String message;

        value = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir un entier : "));
        message =  "Voici la liste des numéros : ";
        for (int i = 1; i <= 10 ; i++) {
            message = message + (i + value) + " - ";

        }
        JOptionPane.showMessageDialog(null, message);
    }
}
