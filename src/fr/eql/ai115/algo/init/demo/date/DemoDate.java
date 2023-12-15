package fr.eql.ai115.algo.init.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DemoDate {

    private static final LogManager logger = LogManager.getLogManager();

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date du jour : " + date);

        // Formater la date jour/mois/année
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Date du jour : " + sdf.format(date));

        Date deprecatedDate = new Date(123,3,20);
        System.out.println("Aujourd'hui nous sommes le " + deprecatedDate);

        // Converir un String en date
        String dateFormat = "20-04-2023 15:15:00";
        sdf = new SimpleDateFormat("dd-MM-yyy hh:mmt:ss");
        try {
            Date newDate = sdf.parse(dateFormat);
            System.out.println("Chaîne de caractères convertie en date : " + newDate);
        } catch (ParseException e) {
            logger.getLogger("La date en chaîne de caratctères ne peut être analysée ni convertie.");
        }

        // Comparer les dates

        try {
            sdf = new SimpleDateFormat("dd-MM-yyy");
            Date date1 = sdf.parse("17-10-1989");
            Date date2 = sdf.parse("15-10-2017");

            // Methodes before(), after() et equals()
            if (date1.after(date2)){
                System.out.println("La date 1 est plus récente que la 2");
            } else if (date1.before(date2)) {
                System.out.println("La date 1 est plus ancienne que la 2");
            } else if (date1.equals(date2)) {
                System.out.println("Ce sont les mêmes dates");
            }

            // Méthode compareTo()
            if (date1.compareTo(date2) > 0) {
                System.out.println("La date 1 est plus récente que la 2");
            } else if (date1.compareTo(date2) < 0) {
                System.out.println("La date 1 est plus ancienne que la 2");
            } else if (date1.compareTo(date2) == 0) {
                System.out.println("Ce sont les mêmes dates");
            }
        } catch (ParseException e) {
            logger.getLogger("une date en string ne peut être analysée et convertie.");
        }
    }
}
