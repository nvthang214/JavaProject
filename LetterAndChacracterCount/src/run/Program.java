/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author emlad
 */
public class Program {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate hash code
        int hashCode = calculateHashCode(input);

        // Count characters
        Map<Character, Integer> charCountMap = countCharacters(input);

        // Display the results
        System.out.println("Hash code: " + hashCode);
        System.out.println("Character count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate hash code of a string
    public static int calculateHashCode(String str) {
        return str.hashCode();
    }

    // Method to count characters in a string
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Update the count in the map
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        return charCountMap;
    }
}


