package be.vdab.collectionsExercise2013;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class Postfix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> intStack = new Stack<>();

        // Scan for expression
        System.out.println("\nEnter expression : ");
        String exp = input.nextLine();

        // Split expression
        String[] terms = exp.split(" ");

        String operand = " ";
        int number1 = 0;
        int number2 = 0;
        // Determine type of terms
        for (int i = 0; i < terms.length; i++) {
            if ((terms[i].equals("+")) ||
                    (terms[i].equals("-")) ||
                    (terms[i].equals("*")) ||
                    (terms[i].equals("/"))){
                // operand
                operand = terms[i];
                // Fetch numbers
                number1 = intStack.pop();
                number2 = intStack.pop();
                switch (operand){
                    case "+": number2 = number1+number2;
                    break;
                    case "-": number2 = number1-number2;
                    break;
                    case "*": number2 = number1*number2;
                    break;
                    case "/": number2 = number1/number2;
                    break;

                }
                intStack.push(number2);
            }else {
                intStack.push(parseInt(terms[i]));
            }
        }

        System.out.println("\nresult : " + number2);
    }
}
