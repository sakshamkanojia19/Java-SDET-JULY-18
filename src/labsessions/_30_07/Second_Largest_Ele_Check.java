package labsessions._30_07;

import java.util.ArrayList;
import java.util.Collections;

public class Second_Largest_Ele_Check {

    public static void main(String[] args) {

        // Step 1: Create and add elements manually
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(75);
        numbers.add(40);
        numbers.add(60);

        // Step 2: Check size
        if (numbers.size() < 2) {
            System.out.println("List must contain at least two elements.");
            return;
        }

        // Step 3: Sort in ascending order
        Collections.sort(numbers);  // [10, 25, 40, 60, 75]

        // Step 4: Get last and second-last elements
        int last = numbers.get(numbers.size() - 1);     // largest
        int secondLast = -1;

        // Step 5: Find the second largest (not equal to last)
        for (int i = numbers.size() - 2; i >= 0; i--) {
            if (numbers.get(i) != last) {
                secondLast = numbers.get(i);
                break;
            }
        }

        // Step 6: Print the result
        if (secondLast != -1) {
            System.out.println("Second Largest Element: " + secondLast);
        } else {
            System.out.println("All elements are the same. No second-largest value.");
        }
    }
}

