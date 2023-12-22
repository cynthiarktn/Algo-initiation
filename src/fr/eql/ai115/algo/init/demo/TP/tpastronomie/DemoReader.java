package fr.eql.ai115.algo.init.demo.TP.tpastronomie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Chars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoReader {

    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/";
    private static final String RAF = "raf.bin";


    public static void main(String[] args) {
        List<String> celestialsObjects = new ArrayList<>();
        int maxSize = 0;
        String buffer = "";

                // calculer le nombre de caractères max

        try {
            FileInputStream fileInputStream = new FileInputStream("files/celestial_objects.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()){
                buffer = scanner.nextLine();

                if (buffer.length() > maxSize){
                    maxSize = buffer.length();
                }
                celestialsObjects.add(buffer);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Rajouter les espaces

        for (int i = 0; i < celestialsObjects.size(); i++) {
            if (celestialsObjects.get(i).length() < maxSize){
                buffer = celestialsObjects.get(i);
                for (int j = 0; j < maxSize - celestialsObjects.get(i).length(); j++) {
                    buffer = buffer + ' ';
                }
                celestialsObjects.set(i,buffer);
            }

        }

        char[] bufferArray;

        // écriture du fichier binaire

        try (RandomAccessFile raf = new RandomAccessFile(FOLDER+RAF,"rw")) {
            for (String celestialsObject : celestialsObjects) {
                bufferArray = celestialsObject.toCharArray();
                for (char c : bufferArray) {
                    raf.writeChar(c);
                }
            }

            raf.seek(0);
            while (raf.getFilePointer() < raf.length()){
                buffer ="";
                for (int i = 0; i < maxSize; i++) {
                    buffer = buffer + raf.readChar();
                }
                System.out.println(buffer);
            }
        } catch (FileNotFoundException e) {
            LOGGER.error("Unable to create " + RAF, e);
        }  catch (IOException e) {
            LOGGER.error("Unable to write bytes in " + RAF, e);
        }

        char [] arrayToSort = buffer.toCharArray();


        for (int i = 0; i < ( arrayToSort.length - 1); i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arrayToSort[j] < arrayToSort[j - 1]) {
                    char Temp = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = Temp;
                }
            }
        }
        String SortedString = new String(arrayToSort);
        System.out.println("The Unsorted String is : " + buffer);
        System.out.println("The Sorted String is : " + SortedString);
    }
}
