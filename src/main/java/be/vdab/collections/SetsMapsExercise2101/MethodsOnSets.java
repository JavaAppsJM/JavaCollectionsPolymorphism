package be.vdab.collections.SetsMapsExercise2101;

import java.util.HashSet;
import java.util.Set;

public class MethodsOnSets {
    public static void main(String[] args) {
        Set<String> subjectSet1 = new HashSet<>();
        subjectSet1.add("Chemistry");
        subjectSet1.add("Mathematics");
        subjectSet1.add("Biology");
        subjectSet1.add("English");

        Set<String> subjectSet2 = new HashSet<>();
        subjectSet2.add("Biology");
        subjectSet2.add("English");
        subjectSet2.add("Geography");
        subjectSet2.add("Physics");


        /* geeft compile fout
        Set<String> cloneSet1 = (HashSet<String>) ((ArrayList<String>) subjectSet1).clone();
        Set<String> cloneSet2 = (HashSet<String>) ((ArrayList<String>) subjectSet2).clone();
        */
        Set<String> cloneSet1 = new HashSet<>(subjectSet1);
        Set<String> cloneSet2 = new HashSet<>(subjectSet2);

        cloneSet1.addAll(subjectSet2);
        cloneSet1.removeAll(subjectSet2);
        System.out.println("\n only in set1 : " + cloneSet1);

        cloneSet2.addAll(subjectSet1);
        cloneSet2.removeAll(subjectSet1);
        System.out.println("\n only in set2 : " + cloneSet2);

        cloneSet1.clear();
        cloneSet1.addAll(subjectSet1);
        cloneSet1.retainAll(subjectSet2);
        System.out.println("\n in both sets : " + cloneSet1);
    }
}
