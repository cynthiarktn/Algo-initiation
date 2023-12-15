package fr.eql.ai115.algo.init.demo.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        // Map est en structure <Key, Value>
        // La clé doit être unique
        // l'accès est direct, on est pas obligé de parcourir tous les éléments de la liste, on va rechercher avec la clé

        // l'index dépend de la position,


        //on donne la clé en faisant put
        Map<Integer,String> fisrtMap = new HashMap<>();
        fisrtMap.put(1,"Lundi");
        fisrtMap.put(2,"Mardi");
        fisrtMap.put(3,"Mercredi");
        fisrtMap.putIfAbsent(4,"Jeudi");
        // Comme la clé doit être unique,
        // on met putIfAbsent pour ne pas écraser s'il y a une clé identique, sinon elle prend la valeur de la clé
        fisrtMap.remove(4); // retire la clé 4
        fisrtMap.replace(1, "Dimanche"); // la clé doit déjà être existante
        // quand on utilise la méthode, on va rechercher par rapport à la clé
        System.out.println(fisrtMap.get(1));

        // on peut itérer dessus pour avoir tous les éléments de la map
        // on peut faire .iter pour automatiser
        for (Map.Entry<Integer,String> m: fisrtMap.entrySet()) {
            System.out.println(m.getKey() + "--" + m.getValue());
        }

        fisrtMap.replaceAll((k,v) -> "Vendredi");
        for (Map.Entry<Integer,String> m: fisrtMap.entrySet()) {
            System.out.println(m.getKey() + "--" + m.getValue());
        }
    }
}
