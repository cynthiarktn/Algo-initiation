package fr.eql.ai115.algo.init.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("v1");
        myList.add("v2");
        myList.add("v3");
        myList.add("v4");
        myList.add("v5");
        myList.add("v6");

        Iterator<String> it = myList.iterator();

        while (it.hasNext()){ // permet d'itérer dans les collections
            System.out.println(it.next()); // renvoie le prochain élément s'il y en a
        }
    }
}
