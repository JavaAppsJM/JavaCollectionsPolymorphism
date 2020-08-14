package be.vdab.SetsMapsExercise2109;

import java.util.*;

public class GuessCapital {
    public static void main(String[] args) {
        // Declarations & initialisations
        Scanner input = new Scanner(System.in);

        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Alabama","Montgomery");
        hashMap.put("Alaska","Juneau");
        hashMap.put("Arizona","Phoenix");
        hashMap.put("Michigan","Detroit");

        // Input State
        System.out.println("Input state : ");
        String stateName = input.nextLine();

        // Determine Capital
        if (hashMap.containsKey(stateName)){
            System.out.println("\nCapital is : " + hashMap.get(stateName));
        }else{
            System.out.println("\nKey not found !");
        }




     }
}
