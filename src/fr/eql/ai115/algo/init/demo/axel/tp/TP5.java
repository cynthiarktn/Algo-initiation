package fr.eql.ai115.algo.init.demo.axel.tp;

import javax.swing.*;

public class TP5 {

    public static void main(String[] args) {

        float number1, number2, result;
        String operation, message;

        String login = JOptionPane.showInputDialog("Saisissez votre identifiant");
        String password = JOptionPane.showInputDialog("Saisissez votre mot de passe");
        if (login.equals("admin") && password.equals("123-Soleil")){
            number1 = Float.parseFloat(JOptionPane.showInputDialog
                    ("Bienvenue sur le Super Calculateur ! Choisissez votre premier nombre."));
            operation = JOptionPane.showInputDialog("Choisissez entre addition, soustraction, multiplication" +
                    "et division");
            number2 = Float.parseFloat(JOptionPane.showInputDialog
                    ("Choisissez votre deuxième nombre."));

            switch (operation) {
                case "addition" :
                    result = number1+number2;
                    message = "Le résultat de " + number1 + " + " + number2 + " est égal à " + result ;
                    break;
                case "soustraction" :
                    result = number1-number2;
                    message = "Le résultat de " + number1 + " - " + number2 + " est égal à " + result ;
                    break;
                case "division" :
                    result = number1/number2;
                    message = "Le résultat de " + number1 + " / " + number2 + " est égal à " + result ;
                    break;
                case "multiplication" :
                    result = number1*number2;
                    message = "Le résultat de " + number1 + " * " + number2 + " est égal à " + result ;
                    break;
                default:
                    message = "Opération inconnue" ;
            }
            JOptionPane.showMessageDialog(null, message);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Identifiant et/ou mot de passe incorrect(s).");
        }
    }
}
