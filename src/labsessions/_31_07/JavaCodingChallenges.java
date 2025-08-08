package labsessions._31_07;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A collection of Java practice problems solved in one class.
 */
public class JavaCodingChallenges {

    public static void main(String[] args) {

        // --- Challenge 1: Expand compressed string ---
        System.out.println("➊ Expand compressed string (e.g., a2b3c4 → aabbbcccc):");
        String input = "a2b3c4";
        String expanded = decompressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + expanded);
        System.out.println();

        // --- Challenge 2: Find second largest number ---
        System.out.println("➋ Find second largest number in array:");
        int[] nums = {12, 35, 1, 10, 34, 1, 35};
        int secondLargest = findSecondLargest(nums);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Second largest: " + secondLargest);
        System.out.println();

        // --- Challenge 3: First non-repeating character ---
        System.out.println("➌ First non-repeating character:");
        String text = "swiss";
        Character uniqueChar = findFirstNonRepeatingChar(text);
        System.out.println("Input: " + text);
        System.out.println("First non-repeating character: " + (uniqueChar != null ? uniqueChar : "None found"));
        System.out.println();

        // --- Challenge 4: Find missing number ---
        System.out.println("➍ Find missing number from 1 to n:");
        int[] series = {1, 2, 3, 5, 6}; // 4 is missing
        int missing = findMissingNumber(series);
        System.out.println("Array: " + Arrays.toString(series));
        System.out.println("Missing number: " + missing);
        System.out.println();

        // --- Challenge 5: Print 1 to 100 without using loops ---
        System.out.println("➎ Print numbers 1 to 100 (without using loops):");
        printNumbersRecursively(1);
        System.out.println(); // new line after printing
    }

    // 1. Decompress string: "a2b3" -> "aabbb"
    public static String decompressString(String input) {
        StringBuilder output = new StringBuilder();
        char currentChar = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                currentChar = ch;
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                output.append(String.valueOf(currentChar).repeat(count));
            }
        }
        return output.toString();
    }

    // 2. Second largest number in array
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }

        return second;
    }

    // 3. First non-repeating character in string
    public static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    // 4. Find missing number from array (1 to n)
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    // 5. Print numbers from 1 to 100 without loop
    public static void printNumbersRecursively(int n) {
        if (n > 100) return;
        System.out.print(n + " ");
        printNumbersRecursively(n + 1);
    }
}
