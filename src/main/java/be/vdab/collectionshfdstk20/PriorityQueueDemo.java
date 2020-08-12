package be.vdab.collectionshfdstk20;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("priorityQueue using Comparable");
        PriorityQueue<String> pQ1 = new PriorityQueue<>();
        pQ1.offer("Oklahoma");
        pQ1.offer("Indiana");
        pQ1.offer("Georgia");
        pQ1.offer("Texas");

        while (pQ1.size() > 0){
            System.out.println(pQ1.remove() + " ");
        }

        System.out.println("priorityQueue using Comparator");
        PriorityQueue<String> pQ2 = new PriorityQueue<>
                (4, Collections.reverseOrder());
        pQ2.offer("Oklahoma");
        pQ2.offer("Indiana");
        pQ2.offer("Georgia");
        pQ2.offer("Texas");

        while (pQ2.size() > 0){
            System.out.println(pQ2.remove() + " ");
        }

    }
}
