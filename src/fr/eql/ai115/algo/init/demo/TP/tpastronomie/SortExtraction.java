package fr.eql.ai115.algo.init.demo.TP.tpastronomie;

import java.util.ArrayList;
import java.util.List;

public class SortExtraction {

    public List<String> sort (List <String> list){

        List<String> sortedList = new ArrayList<>();
        List<String> scannedList = new ArrayList<>(list);
        do {
            int index = 0;

            String buffer = scannedList.get(0);
            for (int i = 0; i < scannedList.size(); i++) {
                if (scannedList.get(i).compareTo(buffer) < 0) {
                    buffer = scannedList.get(i);
                    index = i;
                }
            }

            sortedList.add(buffer);
            scannedList.remove(index);

        } while(sortedList.size()<list.size());

        return sortedList;
    }

}