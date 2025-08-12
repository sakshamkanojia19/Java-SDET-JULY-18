package Collections_Exp;

import java.util.LinkedHashSet;
import java.util.Spliterator;
public class Linked_HashSet_Example {

	public static void main(String[] args) {
    /*
     * 
     * No duplicates allow
     * Insertion Order is Maintained
     * Only one null is allowed
     * Not Synchronized
     * Performance slower than HashSET CAUSE ORDER MAINTAINANCE
     * 
     * */
		
		
		
		  // Creating a LinkedHashSet of Strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // add() - Adding elements (duplicates are ignored)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, will be ignored
        fruits.add(null);     // One null allowed
        fruits.add(null);     // Duplicate null ignored

        System.out.println("LinkedHashSet contents:");
        System.out.println(fruits);  // Insertion order maintained

        // contains()
        System.out.println("\nContains 'Mango'? " + fruits.contains("Mango"));

        // isEmpty()
        System.out.println("Is the set empty? " + fruits.isEmpty());

        // size()
        System.out.println("Size of the set: " + fruits.size());

        // iterator() and forEach()
        System.out.println("\nIterating with forEach:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // remove()
        fruits.remove("Orange");
        System.out.println("\nAfter removing 'Orange': " + fruits);

        // clear()
        LinkedHashSet<String> tempSet = new LinkedHashSet<>(fruits);
        tempSet.clear();
        System.out.println("After clearing tempSet: " + tempSet);

        // clone()
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) fruits.clone();
        System.out.println("\nCloned set: " + clonedSet);

        // addAll()
        LinkedHashSet<String> moreFruits = new LinkedHashSet<>();
        moreFruits.add("Kiwi");
        moreFruits.add("Papaya");
        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // containsAll()
        System.out.println("Contains all from moreFruits? " + fruits.containsAll(moreFruits));

        // retainAll()
        LinkedHashSet<String> tropicalFruits = new LinkedHashSet<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Papaya");
        fruits.retainAll(tropicalFruits);
        System.out.println("After retainAll (keeping only tropicalFruits): " + fruits);

        // removeAll()
        fruits.removeAll(tropicalFruits);
        System.out.println("After removeAll (removing tropicalFruits): " + fruits);

        // toArray()
        Object[] fruitArray = moreFruits.toArray();
        System.out.println("\nArray from moreFruits:");
        for (Object fruit : fruitArray) {
            System.out.println(fruit);
        }

        // spliterator()
        System.out.println("\nUsing Spliterator:");
        Spliterator<String> spliterator = moreFruits.spliterator();
        spliterator.forEachRemaining(System.out::println);

	}

}
