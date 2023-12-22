package fr.eql.ai115.algo.init.demo.io;

// Création de dossier et fichier avec le logger

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DemoFile {

    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique
    private static final String FOLDER = "files/"; // le chemin est relatif.
    private static final String FILE = "file.demo";
    private static final String SUBFOLDER = "sub/folder/";
    private static final String FILE_RENAMED = "renamedFile.demo";


    public static void main(String[] args) {

        File toto = new File("c:/toto");
        // on peut faire tourner en mode debug et ensuite, on peut suivre ce qui se passe dans le programme avec la barre en dessous
        // on utilise les débogueurs pendant qu'on code et on choisit des points d'arrêts
        File folder = new File(FOLDER);

        boolean isCreated = folder.mkdir(); // on va créer un répertoire cette fonction retourne un boolean

        String message = isCreated ? "Le dossier " + FOLDER + " a bien été créé"
                : // sinon
                "Le dossier " + FOLDER + " n'a pas été créé";
        LOGGER.info(message);


        File file = new File(FOLDER + FILE); // fichier file.demo

        try {
            isCreated = file.createNewFile();
            // création d'un nouveau fichier dans le dossier files
            // mais il faut rajouter une exception avec try et catch
            message = isCreated ? "Le fichier " + FILE + " a bien été créé"
                    : // sinon
                    "Le fichier " + FILE + " n'a pas été créé";
            LOGGER.info(message);
        } catch (IOException e) {
            LOGGER.warn("Création du fichier " + FILE + " impossible.");
        }

        // Obtention du chemin absolu d'un fichier
        System.out.println("Chemin absolu du fichier " + FILE + " : " + file.getAbsoluteFile());


        File folders = new File(FOLDER + SUBFOLDER);
        isCreated = folders.mkdirs(); // mkdirs pour les sous-dossiers

        message = isCreated ? "Les dossiers " + FOLDER + SUBFOLDER + " ont bien été créés"
                : // sinon
                "Les dossiers " + FOLDER + SUBFOLDER + " n'ont pas été créé";
        LOGGER.info(message);


        // Renommer un fichier
        File renamedFile = new File(FOLDER + SUBFOLDER + FILE_RENAMED);
        isCreated = file.renameTo(renamedFile); // on renomme file.demo en file.renamed
        message = isCreated ? "Le fichier " + FILE + " a bien été renommé en " + FILE_RENAMED + " et déplacé dans "
                + FOLDER + SUBFOLDER
                : // sinon
                "Le fichier " + FILE + " n'a pas été renommé.";
        LOGGER.info(message);


        // Supprimer un fichier
        isCreated = renamedFile.delete();
        message = isCreated ? "Le fichier " + FILE_RENAMED + " a bien été supprimé "
                : // sinon
                "Le fichier " + FILE_RENAMED + " n'a pas été supprimé.";
        LOGGER.info(message); // file.demo est toujours dans les files, mais quand on relance, il est supprimé


        // Lister les répertoires et les fichiers dans :C

        File root = new File("c:/");
        File[] contents = root.listFiles();

        String type = "";
        for (File f: contents) {
            if (f.isDirectory()){
                type = "Directory";
            } else if (f.isFile()) {
                type = "File";
            }
            System.out.println(f.getName() + " : " + type);
        }

    }
}
