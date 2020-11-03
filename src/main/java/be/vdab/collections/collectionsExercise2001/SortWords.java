package be.vdab.collections.collectionsExercise2001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortWords {
    public static void main(String[] args) {
        // Declarations & initialisations
        Scanner input = new Scanner(System.in);

        // Input name text file
        System.out.println("Give filename (no extension !) : ");
        String fileName = input.nextLine() + ".txt";

        // Read text file
        ArrayList<String> fileLines = new ArrayList<>();
        LinkedList<String[]> fileWords = new LinkedList<>();
        ArrayList<String> wordsLC = new ArrayList<>();
        String[] lnWords = new String[1000];

        System.out.println("...Reading file ");
        try (BufferedReader bfrdr = new BufferedReader(new FileReader(fileName))){
            String line;
            line = bfrdr.readLine();
            while (line != null){
                fileLines.add(line);
                System.out.println(line);

                // Split file line in words
                fileWords.add(line.split(" "));

                for (String sL: fileWords.peekLast()) {
                    wordsLC.add(sL.toLowerCase());
                }

                line = bfrdr.readLine();
            }
            System.out.println("...File read finished.");

            // Sort words
            System.out.println("...Processing file ");
            Collections.sort(wordsLC, Collections.reverseOrder());

            for (String sLine : wordsLC) {
                System.out.println(sLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
