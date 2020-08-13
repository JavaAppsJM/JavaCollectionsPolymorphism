package be.vdab.collectionshfdstk21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",3);
        hashMap.put("Anderson",4);
        hashMap.put("Jan",0);
        hashMap.put("Lewis",3);

        System.out.println("\nhashmap : ");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("\ntreemap : ");
        System.out.println(treeMap);

        Map<String,Integer> lnkHashMap = new LinkedHashMap<>(16,
                0.75f,
                true);
        lnkHashMap.put("Smith",3);
        lnkHashMap.put("Anderson",4);
        lnkHashMap.put("Jan",1);
        lnkHashMap.put("Lewis",3);

        System.out.println("\nage of Lewis : " + lnkHashMap.get("Lewis"));

        System.out.println("\nlnkhashmap :");
        System.out.println(lnkHashMap);

        System.out.println("\nnames and ages :");
        treeMap.forEach((name,age) -> System.out.println(name + ": " + age + " "));
    }
}
