package be.vdab.SetsMapsExercise2104;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountConsVowls {
    public static void main(String[] args) {
        // Declarations & initialisations
        Scanner input = new Scanner(System.in);
        Set<String> vowls = new HashSet<>();
        vowls.add("a");
        vowls.add("e");
        vowls.add("i");
        vowls.add("o");
        vowls.add("u");
        vowls.add("y");
        Set<String> signs = new HashSet<>();
        signs.add(" ");
        signs.add(".");
        signs.add(",");
        signs.add(";");
        signs.add(":");
        signs.add("(");
        signs.add(")");
        signs.add("-");



        // Input name text file
        System.out.println("Give filename (no extension !) : ");
        String fileName = input.nextLine() + ".txt";

        // Read text file
        ArrayList<String> fileLines = new ArrayList<>();
        String charInLine;
        int countVowl = 0;
        int countCons = 0;

        System.out.println("...Reading file ");
        try (BufferedReader bfrdr = new BufferedReader(new FileReader(fileName))){
            String line;
            line = bfrdr.readLine();
            while (line != null){
                fileLines.add(line);
                System.out.println(line);

                // Determine consonants and vowels for line
                for (int i = 0; i < line.length(); i++) {
                    charInLine = line.substring(i,i+1);

                    // Is it a vowel, consonant or a sign
                    if (vowls.contains(charInLine)){
                        countVowl++;
                    }else if (signs.contains(charInLine)){
                        // do nothing
                    }else {
                        countCons++;
                    }
                }
                line = bfrdr.readLine();
            }
            System.out.println("...File read finished.");

            // Displays
            System.out.println("\nNumber of vowels = " + countVowl);
            System.out.println("\nNumber of consonants = " + countCons);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
