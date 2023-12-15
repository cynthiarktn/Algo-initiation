package fr.eql.ai115.algo.init.demo.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    // le logger ne se déclare qu'une fois, c'est static et ne fonctionne que dans ce fichier
    private static final Logger LOGGER = LogManager.getLogger(); //méthode statique

    // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
    public static void main(String[] args) {
        LOGGER.debug("Un log utile en phase de développement ou pour le debug.");
        LOGGER.info("Un log informatif.");
        LOGGER.warn("Un log d'alerte pas trop méchant.");
        LOGGER.error("Un log pour signaler une erreur qui n'a pas fait planter l'application.");
        LOGGER.fatal("Un log pour signaler une erreur qui est susceptible de faire planter l'application.");

    }

}
