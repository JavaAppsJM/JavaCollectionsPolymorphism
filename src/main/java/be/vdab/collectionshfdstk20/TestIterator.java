package be.vdab.collectionshfdstk20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        System.out.println("collection met iterator...");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase() + " ");
        }

        System.out.println("de clone zndr iterator mr met forEach...");
        Collection<String> colClone = (Collection<String>) ((ArrayList<String>) collection).clone();

        colClone.forEach(e -> System.out.println(e.toUpperCase() + " "));

    }
}
