package be.vdab.collectionsExercise2011;

import java.util.*;

public class TurnAround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> inStack = new Stack<>();
        Stack<Integer> outStack = new Stack<>();

        // Input 10 integers
        System.out.println("\n instack : ");
        for (int i = 0; i < 10; i++) {
            inStack.push(input.nextInt());
        }

        // Add elements reverse
        while (inStack.size() > 0){
            if (outStack.search(inStack.peek()) == -1){
                outStack.add(inStack.pop());
            } else{
                inStack.pop();
            }
        }

        System.out.println("\n outstack : ");
        for (Integer i: outStack) {
            System.out.print(i + " ");

        }

    }
}
