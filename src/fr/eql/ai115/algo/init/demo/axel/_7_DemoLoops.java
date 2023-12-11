package fr.eql.ai115.algo.init.demo.axel;

import javax.swing.*;

public class _7_DemoLoops {
    public static void main(String[] args) {

        System.out.println("*** Boucle FOR ***");
        for (int i = 1; i < 10; i++) {
            // borne inférieure; borne supérieure; incrémentation après chaque tour de boucle
            System.out.println(i + " tour(s) dans la boucle");
        }

        System.out.println();
        String word;
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                word = " tour ";
            } else {
                word = " tours ";
            }
            System.out.println(i + word + "dans la boucle");
        }

        System.out.println();
        for (int i = 1; i < 10; i++) {
            word = i == 1 ? " tour " : " tours "; // expression ternaire
            // ? demande si 1 vrai ou faux, si vrai "tour" : sinon "tours"
            System.out.println(i + word + "dans la boucle");
        }

        System.out.println("\r\n*** Boucle WHILE ***");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer un nombre positif."));

        while (number < 0) {
            number = Integer.parseInt(JOptionPane.showInputDialog(
                    "Votre nombre est négatif. Veuillez recommencer"));
        }
        JOptionPane.showMessageDialog(null, "Bravo, votre nombre est bien positif !");

        System.out.println("\r\n*** Boucle DO... WHILE ***");
        float credit = 1000, payment;

        do {
            payment = Float.parseFloat(JOptionPane.showInputDialog("Votre crédit est de " + credit + ".\r\n" +
                    "Quelle somme souhaitez-vous rembourser ?"));
            credit -= payment;
        } while (credit > 0);
        JOptionPane.showMessageDialog(null, "Votre crédit est remboursé.");
    }
}
