package fr.eql.ai115.algo.init.demo.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DemoTime {
    public static void main(String[] args) {
        // Date du jour
        LocalDate today = LocalDate.now();
        System.out.println("Aujourd'hui nous sommes le " + today);

        // Date différente
        LocalDate date = LocalDate.of(2023,5,12);
        System.out.println("Une date : " + date);

        //Modifier une date
        LocalDate modifiedDate = date.withYear(2026).withMonth(12);
        System.out.println("Date modifiée : " + modifiedDate);

        // Convertir une string en date
        LocalDate parsedDate = LocalDate.parse(
                "2018-02-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Date analysée et convertie : " + parsedDate);

        // Incrémenter ou décrémenter une date
        LocalDate incrementedDate = today.plusDays(22);
        System.out.println("Date du jour incrémentée de 22 jours : " + incrementedDate);
        LocalDate decrementedDate = today.minusDays(5);
        System.out.println("Date du jour moins 5 jours : " + decrementedDate);


        // Heure locale
        LocalTime rightNow = LocalTime.now();
        System.out.println("Heure actuelle : " + rightNow);

        // Transformer une string en heure
        LocalTime parsedTime = LocalTime.parse("16:28");
        System.out.println("Heure analysée et convertie : " + parsedTime);

        // Incrémenter ou décrémenter une heure
        LocalTime modifiedTime = rightNow.plusHours(22).minusMinutes(50);
        System.out.println("Heure modifiée : " + modifiedTime);

        // Afficher les noms du jour et du mois
        String dayName = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE);
        String monthName = today.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE);
        System.out.println("Date du jour en français : " +
                dayName+ " " + today.getDayOfMonth() + " " + monthName + " " + today.getYear());

        // Fuseaux horaires

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        System.out.println("La date et l'heure de ma machine : " + zonedDateTime);

        ZonedDateTime australiaSydneyZonedDateTime =
                ZonedDateTime.of(
                        LocalDateTime.now(ZoneId.of("Australia/Sydney")),
                        ZoneId.of("Australia/Sydney"));
        System.out.println("La date et l'heure de Sydney : " + australiaSydneyZonedDateTime);
    }
}
