package Collections_Exp;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Vectors_Examples {

    public static void main(String[] args) {

        /*
         * Vector:
         * - Implements List, RandomAccess, Cloneable, Serializable
         * - Thread-safe (synchronized)
         * - Maintains insertion order
         * - Allows duplicates and nulls
         * - Has capacity management methods like capacity()
         */

        // Create Vector with initial capacity of 5 and capacity increment of 3
        Vector<String> vector = new Vector<>(5, 3); 

        System.out.println("Initial capacity: " + vector.capacity()); // 5

        // Add elements
        vector.add("Ravi");
        vector.add("Saksham");
        vector.add("Tina");
        vector.add("Peter");
        vector.add("Sanjay");

        System.out.println("Capacity after 5 elements: " + vector.capacity()); // Still 5
        System.out.println("Size: " + vector.size());                         // 5

        // Adding one more element triggers capacity increase by 3
        vector.add("Rima"); 
        System.out.println("Capacity after adding 6th element: " + vector.capacity()); // 8
        System.out.println("Size: " + vector.size());                                   // 6

        // Add more elements
        vector.add("Ravi");   // Duplicate
        vector.add(null);     // Null allowed

        System.out.println("Vector content: " + vector);
        System.out.println("Element at index 3: " + vector.get(3));
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
        System.out.println("Index of 'Peter': " + vector.indexOf("Peter"));

        // Replace element
        vector.set(4, "King");
        System.out.println("After replacing index 4 with 'King': " + vector);

        // Remove elements
        vector.remove(6); // remove "Ravi"
        System.out.println("After removing index 6: " + vector);

        // Insert element at specific index
        vector.add(2, "Inserted");
        System.out.println("After inserting at index 2: " + vector);

        // Iteration using Enumeration
        System.out.print("Iterating with Enumeration: ");
        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

        // Iteration using enhanced for-loop
        System.out.print("Enhanced for-loop: ");
        for (String val : vector) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Final details
        System.out.println("Final size: " + vector.size());
        System.out.println("Final capacity: " + vector.capacity());
        System.out.println("Is vector empty? " + vector.isEmpty());
    }
}
