package be.vdab.collectionshfdstk21;

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Oklahoma");
        set1.add("Indiana");
        set1.add("Georgia");
        set1.add("Texas");
        set1.add("Texas2");

        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        set1.remove("Texas2");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        Set<String> set2 = new HashSet<>();
        set2.add("Oklahoma");
        set2.add("Argentina");
        set2.add("Georgia");

        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");

        System.out.println("\nis Taipei in set ? " + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("\nafter adding set2 to set1 :" + set1);

        set1.removeAll(set2);
        System.out.println("\nafter removing set2 : " + set1);

        set1.retainAll(set2);
        System.out.println("\nafter retaining set2 : " + set1);






    }
}
