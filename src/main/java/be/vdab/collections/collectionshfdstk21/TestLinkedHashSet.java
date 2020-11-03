package be.vdab.collections.collectionshfdstk21;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Oklahoma");
        set.add("Indiana");
        set.add("Georgia");
        set.add("Texas");
        set.add("Texas2");

        set.add("Texas2");
        System.out.println(set);




    }
}
