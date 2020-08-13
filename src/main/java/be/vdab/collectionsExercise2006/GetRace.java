package be.vdab.collectionsExercise2006;

import java.util.*;

public class GetRace {
    public static void main(String[] args) {
        int mI10 = 10000000;
        // Declare arraylist
        List<Integer> intList = new ArrayList<>();
        // Store 10 Mi integers
        for (int i = 0; i <= mI10; i++) {
            intList.add(i);
        }

        // Using get for 10 Mith element
        System.out.println("\10Mith element : " + intList.get(mI10));

        // Loop met get
        Date startGMs = new Date();
        for (int i = 0; i <= mI10; i++) {
            intList.get(i);
        }
        Date endGMs = new Date();
        System.out.println("\nLoop with get : " + (endGMs.getTime()-startGMs.getTime()));

        
        // Using iterators for the 10Mith element
        Date startIMs = new Date();
        Iterator<Integer> itInt = intList.iterator();
        while (itInt.hasNext()){
            itInt.next();
        }
        Date endIMs = new Date();
        System.out.println("\nLoop with iterator : " + (endIMs.getTime()-startIMs.getTime()));

    }
}
