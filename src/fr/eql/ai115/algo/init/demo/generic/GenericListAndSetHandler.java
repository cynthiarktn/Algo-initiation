package fr.eql.ai115.algo.init.demo.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericListAndSetHandler <T,U>{ // au moment où on crée la classe, on peut lui donner un type ou plusieurs

    List<T> myListOfString = new ArrayList<>();

    Set<U> mySetOfStrings = new HashSet<>(); // n'accepte pas les doublons

    public List<T> addsSomethingToMyListOfThings(T thing){
        myListOfString.add(thing);
        return myListOfString;
    }

    public Set<U> addsSomethingToMySetOfThings(U otherThing){
        mySetOfStrings.add(otherThing);
        return mySetOfStrings;
    }
}
