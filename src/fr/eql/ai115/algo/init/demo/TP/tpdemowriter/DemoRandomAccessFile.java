package fr.eql.ai115.algo.init.demo.TP.tpdemowriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

// fichier à accès aléatoire on peut lire où on veut dans un fichier binaire
// on va à la position qui nous intéresse pour la comparer avec ce qu'on veut
public class DemoRandomAccessFile {


    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/"; // le chemin est relatif.
    private static final String RAF = "raf.bin";

    public static void main(String[] args) {
        File folder = new File(FOLDER);
        folder.mkdir();

        // Random Access File est un fichier binaire à accès direct
        System.out.println("Ecriture dans le RAF");
        try (RandomAccessFile raf = new RandomAccessFile(FOLDER+RAF,"rw")){
            byte[] bytes = {58,45,87,112,74};
            // Le RAF possède des méthodes pour écrire chaque type primitif présent en Java
            for (byte b: bytes) {
                raf.writeByte(b);
            }
            raf.writeChar('a');

            // le contenu du raf occupe 7 octets (5 pour les bytes et 2 pour les chars)
            System.out.println("Taille du RAF : " + raf.length());

            raf.seek(0); // permet de positionner le pointeur là où la lecture / écriture sera effectuée
            System.out.println("Avant lecture, le pointeur se situe sur la position " + raf.getFilePointer());
            // permet de savoir où est placé le pointeur

            raf.seek(4); // position sur le 5ème octet puis lecture avec readXXX()
            System.out.println("Le pointeur se situe maintenant sur la position : " + raf.getFilePointer());
            System.out.println("Lecture du 5ème octet : " + raf.readByte());
            System.out.println("Le pointeur se situe maintenant sur la position : " + raf.getFilePointer());
            System.out.println("Lecture du caractère : " + raf.readChar());
            System.out.println("Le pointeur se situe maintenant sur la position : " + raf.getFilePointer());

            int[] numbers = {45,87,456789,7897,65};
            raf.seek(0);
            for (int n : numbers){
                raf.writeInt(n);
            }
            // lecture du 5eme entier (donc 4*4 octets)
            raf.seek(4*4);
            System.out.println("Lecture du 5ème entier : " + raf.readInt());
        } catch (FileNotFoundException e) {
            LOGGER.error("Unable to create " + RAF, e);
        }  catch (IOException e) {
            LOGGER.error("Unable to write bytes in " + RAF, e);
        }
    }
}
