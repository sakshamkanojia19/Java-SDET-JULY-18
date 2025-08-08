package Collections_Exp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.ArrayList;

public class Hashset_Example {

    public static void main(String[] args) {

        /*
         * HashSet:
         * - No Duplicate elements allowed
         * - No guaranteed order
         * - Nulls are allowed (only one)
         * Multiple allowed but prints one 
         * - Not synchronized
         * - Operations are faster than List interface
         * 
         * Pt not provide null value
         * 
         */

        // Create a HashSet
        Set<Integer> hashSet = new HashSet<>();

        // Add elements (including duplicates and null)
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(null);    // ✅ allowed in HashSet
        hashSet.add(40);
        hashSet.add(20);      // Duplicate, ignored
        hashSet.add(null);    // Duplicate null, ignored

        // Print original HashSet (no order guaranteed)
        System.out.println("Original HashSet (unordered): " + hashSet);

        // Basic operations
        System.out.println("Contains 30? " + hashSet.contains(30));

        hashSet.remove(10);
        System.out.println("After removing 10: " + hashSet);

        hashSet.add(60);
        System.out.println("After adding 60: " + hashSet);

        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Is set empty? " + hashSet.isEmpty());

        System.out.println("Iterating using for-each:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        // ✅ Sort in Ascending Order using TreeSet, skipping null
        Set<Integer> sortedAsc = new TreeSet<>();
        for (Integer num : hashSet) {
            if (num != null) {
                sortedAsc.add(num);
            }
        }
        System.out.println("Sorted in Ascending Order (TreeSet): " + sortedAsc);

        // ✅ Sort in Descending Order using ArrayList, skipping null
        ArrayList<Integer> sortedDesc = new ArrayList<>();
        for (Integer num : hashSet) {
            if (num != null) {
                sortedDesc.add(num);
            }
        }
        Collections.sort(sortedDesc, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + sortedDesc);

        // Clear the HashSet
        hashSet.clear();
        System.out.println("After clearing HashSet: " + hashSet);
    }
}



/*
 * 
 * | Collection | Allows `null` | Sorted? | Throws Error with `null`? |
| ---------- | ------------- | ------- | ------------------------- |
| `HashSet`  | ✅ Yes (1)     | ❌ No    | ❌ No                      |
| `TreeSet`  | ❌ No          | ✅ Yes   | ✅ Yes                     |

Exception in thread "main" java.lang.NullPointerException: 
Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null


You're trying to create a TreeSet from a HashSet that contains null, like this:

java
Copy
Edit
Set<Integer> hashSet = new HashSet<>();
hashSet.add(null);  // ✅ allowed in HashSet

Set<Integer> sortedSet = new TreeSet<>(hashSet);  // ❌ throws NullPointerException
TreeSet uses compareTo() internally for sorting, and null cannot be compared to any number → it throws NullPointerException.


Option 1: 👉 Remove or skip null values before converting to a TreeSet.


Set<Integer> hashSet = new HashSet<>();
hashSet.add(10);
hashSet.add(null);  // Valid in HashSet
hashSet.add(5);
hashSet.add(20);

// Remove null before sorting
hashSet.remove(null);  // ✅ fix the error

Set<Integer> sortedSet = new TreeSet<>(hashSet);  // ✅ Now works fine
System.out.println("Sorted Set: " + sortedSet);


2. Alternative (Auto-skip nulls):
If you want to auto-skip null, use a loop:

	
Set<Integer> hashSet = new HashSet<>();
hashSet.add(10);
hashSet.add(null);
hashSet.add(5);

Set<Integer> sortedSet = new TreeSet<>();
for (Integer num : hashSet) {
    if (num != null) {
        sortedSet.add(num);  // skip null manually
    }
}
System.out.println("Sorted Set: " + sortedSet);




 * 
 * */
