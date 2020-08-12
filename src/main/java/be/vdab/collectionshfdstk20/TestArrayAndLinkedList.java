package be.vdab.collectionshfdstk20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(1);
        arrList.add(4);
        arrList.add(0,10);
        arrList.add(3,30);

        System.out.println("array list : ");
        System.out.println(arrList);

        // Linked lists
        LinkedList<Object> linkList = new LinkedList<>(arrList);
        linkList.add(1,"red");
        linkList.removeLast();// 4?
        linkList.addFirst("green");

        System.out.println("linkedlist forward ...");
        ListIterator<Object> listIter = linkList.listIterator();
        while (listIter.hasNext()){
            System.out.println(listIter.next() + " ");
        }

        System.out.println("linkedlist backward ...");
        while (listIter.hasPrevious()){
            System.out.println(listIter.previous() + " ");
        }

    }
}
