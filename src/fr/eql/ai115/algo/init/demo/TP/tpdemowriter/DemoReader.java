package fr.eql.ai115.algo.init.demo.TP.tpdemowriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class DemoReader {

    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/";
    private static final String FILE_WRITER_FILE = "fw.txt";
    private static final String BUFFERED_WRITER_FILE = "bw.txt";
    private static final String RAF = "raf.bin";


    public static void main(String[] args) {
        // main à exécuter une fois après avoir exécuté au moins une fois le DemoWriter

        String content;
        System.out.println("File reader");

        try {
            FileReader reader = new FileReader(FOLDER + FILE_WRITER_FILE);
            int character = 0;
            content = " ";
            while ((character =  reader.read()) != 1) {
                content += (char) character;
            }

            System.out.println("Contenu du fichier : " + content);
            reader.close();
        } catch (FileNotFoundException e) {
            LOGGER.error("Unable to open " + FILE_WRITER_FILE);
        } catch (IOException e) {
            LOGGER.error("Unable to close stream on " + FILE_WRITER_FILE);
        }

        System.out.println("Buffered writer");
        try {
            FileReader fr = new FileReader(FOLDER + BUFFERED_WRITER_FILE);
            BufferedReader br = new BufferedReader(fr);

            content = " ";
            while (br.ready()) {
                content += br.readLine() + "\r\n";
            }

            System.out.println("Contenu du fichier : \r\n" + content);

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            LOGGER.error("Unable to open " + BUFFERED_WRITER_FILE);
        } catch (IOException e) {
            LOGGER.error("Unable to stream " + BUFFERED_WRITER_FILE);
        }

    }
}


