package be.vdab.collectionshfdstk20;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> quecoo = new LinkedList<>();
        quecoo.offer("Oklahoma");
        quecoo.offer("Indiana");
        quecoo.offer("Georgia");
        quecoo.offer("Texas");

        while (quecoo.size() > 0){
            System.out.println(quecoo.remove() + " ");
        }
    }
}
