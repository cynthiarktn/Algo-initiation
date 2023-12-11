package fr.eql.ai115.algo.init.demo.axel;

import javax.swing.*;

public class _6_DemoCase {
    public static void main(String[] args) {
        String message;
        String weapon = JOptionPane.showInputDialog("Un troll vous attaque. " +
                "\r\nQuelle arme souhaitez-vous utiliser ? (épée/arc/magie)");

        switch (weapon) {
            case "épée":
                message = "Vous avez choisi la voie du guerrier." +
                        "\r\nVotre coup d'épée fait perdre 2PV au troll";
                break; // casse la structure de contrôle si le break est enlevé, il exécute le contenu suivant
            case "arc":
                message = "Vous avez choisi la voie du chasseur." +
                        "\r\nVotre flèche fait perdre 1PV au troll";
                break;
            case "magie":
                message = "Vous avez choisi la voie du sorcier." +
                        "\r\nMalheureusement, le troll est résistant à la magie." +
                        "\r\nIl vous mange.";
                break;
            default: // équivaut à others
                message = "Vous faites le malin. Vous êtes tout nu.\r\nLe troll vous mange.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
