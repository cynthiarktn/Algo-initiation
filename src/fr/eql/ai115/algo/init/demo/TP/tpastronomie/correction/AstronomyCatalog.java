package fr.eql.ai115.algo.init.demo.TP.tpastronomie.correction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

    /**
     * A searchable astronomy catalog.
     *
     * @author akatz
     */
    public class AstronomyCatalog {

        /////////////////
        /// Attributs ///
        /////////////////

        private static final Logger logger = LogManager.getLogger();

        private static final int NAME_LENGTH = 18;
        private static final int DIAMETER_LENGTH = 7;
        private static final int TYPE_LENGTH = 30;
        private static final int ORBIT_LENGTH = 13;
        private static final int OBJECT_LENGTH = NAME_LENGTH + DIAMETER_LENGTH + TYPE_LENGTH + ORBIT_LENGTH;
        private static final int OBJECT_RAF_LENGTH = OBJECT_LENGTH * 2;

        private final String sourceFile;
        private final RandomAccessFile raf;
        private int objectsCount;

        /////////////////////
        /// Constructeurs ///
        /////////////////////

        /**
         * This constructor will create the RandomAccessFile instance used to write and read celestial objects.
         *
         * @param sourceFile The path to the text file containing the list of
         *                   celestial objects to write in the binary file.
         * @param binaryFile The path to the binary file.
         * @throws FileNotFoundException When the creation or access to the binary file fails.
         */
        public AstronomyCatalog(String sourceFile, String binaryFile) throws FileNotFoundException {
            this.sourceFile = sourceFile;
            raf = new RandomAccessFile(binaryFile, "rw");
        }

        //////////////////////////
        /// Méthodes publiques ///
        //////////////////////////

        /**
         * Displays a list of celestial objects in the console and a dialog box for a search in the list.
         * The binary file containing the objects is written if empty.
         */
        public void open() {
            try {
                if (raf.length() == 0) {
                    writeObjects();
                    sortObjects();
                } else {
                    objectsCount = (int) (raf.length() / OBJECT_RAF_LENGTH);
                }
                displayObjects();
                menu();
            } catch (IOException e) {
                logger.error("Impossible d'effectuer une opération sur le fichier binaire des objets célestes.");
            }
        }

        ////////////////////////
        /// Méthodes privées ///
        ////////////////////////

        /**
         * Writes celestial objects from the source file in the binary file.
         *
         * @throws IOException Error accessing source file or writing in binary file.
         */
        private void writeObjects() throws IOException {
            FileReader source = new FileReader(sourceFile);
            BufferedReader reader = new BufferedReader(source);
            String line;
            /* Pour sauter la première ligne */
            reader.readLine();
            /* Pour toutes les lignes suivantes */
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\*");
                Integer[] lengths = new Integer[]{NAME_LENGTH, DIAMETER_LENGTH, TYPE_LENGTH, ORBIT_LENGTH};
                for (int i = 0; i < words.length; i++) {
                    words[i] = addSpaces(words[i].trim(), lengths[i]);
                    raf.writeChars(words[i]);
                }
                objectsCount++;
            }
        }

        /**
         * Adds the necessary spaces to a given word, in order to make it
         * the required length to be written in the binary file.
         *
         * @param word           The word to complete.
         * @param categoryLength The length required for that category of word.
         * @return The correctly sized word.
         */
        private String addSpaces(String word, int categoryLength) {
            int spaces = categoryLength - word.length();
            StringBuilder builder = new StringBuilder();
            builder.append(word);
            for (int i = 0; i < spaces; i++) {
                builder.append(" ");
            }
            return builder.toString();
        }

        /**
         * Displays in the console a list of celestial objects read from the binary file.
         *
         * @throws IOException When reading the binary file.
         */
        private void displayObjects() throws IOException {
            raf.seek(0);
            for (int j = 0; j < objectsCount; j++) {
                String object = readChars(OBJECT_LENGTH);
                System.out.println(object);
            }
        }

        /**
         * Reads a selection of characters in the binary file.
         *
         * @param length The number of characters to read.
         * @return A string of the read characters.
         * @throws IOException When reading the binary file.
         */
        private String readChars(int length) throws IOException {
            StringBuilder chars = new StringBuilder();
            for (int i = 0; i < length; i++) {
                chars.append(raf.readChar());
            }
            return chars.toString();
        }

        /**
         * Sort celestial objects by name, using a selection sort.
         *
         * @throws IOException When reading or writing in the binary file.
         */
        private void sortObjects() throws IOException {
            for (int i = 0; i < objectsCount - 1; i++) {
                int otherIndex = i;
                raf.seek((long) i * OBJECT_RAF_LENGTH);
                String name = readChars(NAME_LENGTH);

                for (int j = i + 1; j < objectsCount; j++) {
                    raf.seek((long) j * OBJECT_RAF_LENGTH);
                    String nextName = readChars(NAME_LENGTH);

                    if (nextName.compareToIgnoreCase(name) < 0) {
                        otherIndex = j;
                        name = nextName;
                    }
                }
                switchObjects(i * OBJECT_RAF_LENGTH, otherIndex * OBJECT_RAF_LENGTH);
            }
        }

        /**
         * Switches two celestial objects entry in the binary file, by rewriting them in place of each other.
         *
         * @param index      The position of the first object in the binary file.
         * @param otherIndex The position of the second object in the binary file.
         * @throws IOException When reading or writing in the binary file.
         */
        private void switchObjects(int index, int otherIndex) throws IOException {
            raf.seek(index);
            String object = readChars(OBJECT_LENGTH);
            raf.seek(otherIndex);
            String otherObject = readChars(OBJECT_LENGTH);
            raf.seek(index);
            raf.writeChars(otherObject);
            raf.seek(otherIndex);
            raf.writeChars(object);
        }

        /**
         * A dialog box allowing celestial objects search on the binary file.
         *
         * @throws IOException When reading the binary file at the launch of the search request.
         */
        private void menu() throws IOException {
            boolean isDone = false;
            do {
                String name = JOptionPane.showInputDialog("Veuillez saisir le nom d'un objet céleste :");
                if (name == null) {
                    isDone = true;
                } else {
                    searchObject(0, objectsCount, name);
                }
            } while (!isDone);
        }

        /**
         * Operates recursively a dichotomy search for a particular celestial object, by name.
         * The result (found or not) is displayed in a dialog box.
         *
         * @param lowerIndex   The lower index used in an iteration of the search.
         * @param upperIndex   The upper index used in an iteration of the search.
         * @param searchedName The name of the queried object.
         * @throws IOException When reading the binary file.
         */
        private void searchObject(int lowerIndex, int upperIndex, String searchedName) throws IOException {
            if (lowerIndex <= upperIndex) {
                int pivot = (lowerIndex + upperIndex) / 2;
                raf.seek((long) pivot * OBJECT_RAF_LENGTH);
                String foundName = readChars(NAME_LENGTH).trim();
                if (searchedName.compareToIgnoreCase(foundName) == 0) {
                    raf.seek((long) pivot * OBJECT_RAF_LENGTH);
                    JOptionPane.showMessageDialog(null,
                            "************ " + readChars(NAME_LENGTH).trim() + " ************" +
                                    "\r\nDiamètre moyen : " + readChars(DIAMETER_LENGTH).trim() + " km" +
                                    "\r\nType : " + readChars(TYPE_LENGTH) +
                                    "\r\nOrbite : " + readChars(ORBIT_LENGTH));
                } else {
                    if (searchedName.compareToIgnoreCase(foundName) < 0) {
                        searchObject(lowerIndex, pivot - 1, searchedName);
                    } else {
                        searchObject(pivot + 1, upperIndex, searchedName);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Objet céleste introuvable.");
            }
        }
    }

