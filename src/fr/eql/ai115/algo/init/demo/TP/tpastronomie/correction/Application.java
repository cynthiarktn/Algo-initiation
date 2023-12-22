package fr.eql.ai115.algo.init.demo.TP.tpastronomie.correction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Application {

    private static final Logger logger = LogManager.getLogger();

    private static final String SOURCE_FILE = "resources/celestial_objects.txt";
    private static final String BINARY_FILE = "resources/celestial_objects.bin";

    public static void main(String[] args) {
        try {
            AstronomyCatalog catalog = new AstronomyCatalog(SOURCE_FILE, BINARY_FILE);
            catalog.open();
        } catch (FileNotFoundException e) {
            logger.error("Impossible d'accéder au fichier binaire des objets célestes.");
        }
    }
}