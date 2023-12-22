package fr.eql.ai115.algo.init.demo.TP.tpdemowriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class DemoIOStream {
    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/";
    private static final String STREAM = "stream.demo";

    public static void main(String[] args) {
        File folder = new File(FOLDER);
        folder.mkdir();

        File file = new File(FOLDER+STREAM);

        // FOS permet d'écrire des octets (bytes) dans un fichier
        try (FileOutputStream fos = new FileOutputStream(file);
             FileInputStream fis = new FileInputStream(file)) {
            file.createNewFile();
            int[] bytes = {120000001, 28, 58, 45, 258};

            // on écrit sous forme d'octets chacun des entiers contenus dans le tableau d'entiers
            for (int b : bytes) {
                fos.write(b);
            }
            int i =0;

            //read() de FIS permet de lire le prochain octet dans le fichier
            // et renvoie -1 quand la fin du fichier a été atteinte

            System.out.println("Les octets de mon fichier, affichés sous la forme d'ntiers qui y ont été insérés.");
            while ((i = fis.read()) != -1) {
                System.out.println(i);
            }
        } catch (IOException e) {
            LOGGER.error("An error occured while creating '" + STREAM + "'.", e);
        }
    }
}
