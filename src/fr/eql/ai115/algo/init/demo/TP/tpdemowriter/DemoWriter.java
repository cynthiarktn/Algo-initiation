package fr.eql.ai115.algo.init.demo.TP.tpdemowriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class DemoWriter {


    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/"; // le chemin est relatif.
    private static final String FILE_WRITER_FILE = "fw.txt";
    private static final String BUFFERED_WRITER_FILE = "bw.txt";


    public static void main(String[] args) {
        File folder = new File(FOLDER);
        folder.mkdir();

        System.out.println("File writer");

        try {
            FileWriter writer = new FileWriter(FOLDER + FILE_WRITER_FILE,false);
            writer.write("Hello ! ");
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Unable to operate on file.");
        }

        System.out.println("Buffered writer");
        try {
            FileWriter fw = new FileWriter(FOLDER + BUFFERED_WRITER_FILE,false);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello ! ");
            bw.newLine();
            bw.write("How are you ?");

            bw.close();
            fw.close();
        } catch (IOException e) {
            LOGGER.error("Unable to operate on file.");
        }

    }
}
