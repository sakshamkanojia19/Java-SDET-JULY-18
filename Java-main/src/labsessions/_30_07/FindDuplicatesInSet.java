package labsessions._30_07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInSet {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Saksham", "Alice", "Bob", "Saksham", "Kanojia", "Eve");

        // Set to store unique elements
        Set<String> uniqueItems = new HashSet<>();

        // Set to store duplicates
        Set<String> duplicates = new HashSet<>();

        // Loop through the list
        for (String name : names) {
            // If name can't be added, it's a duplicate
            if (!uniqueItems.add(name)) {
                duplicates.add(name);
            }
        }

        // Output results
        System.out.println("Original List: " + names);
        System.out.println("Duplicate Elements: " + duplicates);
    }
}
