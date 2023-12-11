package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP7 {

    public static void main(String[] args) {

        int value;
        String message;

        value = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir un entier : "));
        message =  "Table de " + value + " : \r\n";

        for (int i = 1; i <= 10 ; i++) {
            message = message + value + " x " + i + " = " + (i * value) + "\r\n";

        }
        JOptionPane.showMessageDialog(null, message);
    }
}
