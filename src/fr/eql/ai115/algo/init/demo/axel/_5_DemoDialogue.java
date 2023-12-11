package fr.eql.ai115.algo.init.demo.axel;

import javax.swing.*;

public class _5_DemoDialogue {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Saisissez votre nom");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Saisissez votre âge"));
        JOptionPane.showMessageDialog(null,
                "Bonjour "+ name +". Vous avez " + age + "ans.");
        // parent component et message sont mis automatiquement
    }
}
