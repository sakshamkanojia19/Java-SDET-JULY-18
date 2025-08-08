package Collections_Exp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets_Example {

	public static void main(String[] args) {
		/*
		 * Contains no duplicate elements
		 * at most one null elements
		 * non synchronized
		 * 
		 * data is displayed in asending order
		 * 
		 * operation are faster than the lists interface
		 * 
		 * Link hashmap, 
		 * 
		 * No null values allowed
		 * */
		//can not create object of interface as well abstract class
		Set<String> st  = new TreeSet<String>();
		
		
		st.add("orange");
		st.add("banana");
		st.add("grapes");
		st.add("apple");
		st.add("pineapple");
		st.add("grapes");
		
		st.add("null");
		st.add("null");
		
		
		System.out.println(st);
		System.out.println(st.remove("apple"));
		System.out.println(st);

		System.out.println(st.add("Saksham"));
		
	   System.out.println(st);
	   
	   System.out.println(st.size());
	   
	   
//	   Set<Integer> numbers = new TreeSet<Integer>();
	   
	   Set<Integer> numbers = new HashSet<>();
//	   numbers.add(null); // ✅ works in HashSet (but still only allows 1 null)


       // Add integers to the set (duplicates will be ignored)
       numbers.add(50);
       numbers.add(10);
       numbers.add(30);
       numbers.add(20);
       numbers.add(10); // duplicate, will be ignored
       numbers.add(40);
       numbers.add(null); // TreeSet does not allow null elements

       // Print the set (it will be sorted automatically)
       System.out.println("Original Set: " + numbers);

       // Remove an element
       boolean isRemoved = numbers.remove(30);
       System.out.println("Removed 30: " + isRemoved);
       System.out.println("Set after removal: " + numbers);

       // Check if an element exists
       boolean contains20 = numbers.contains(20);
       System.out.println("Set contains 20? " + contains20);

       // Add a new element
       boolean added = numbers.add(60);
       System.out.println("Added 60: " + added);
       System.out.println("Set after adding 60: " + numbers);

       // Size of the set
       System.out.println("Size of set: " + numbers.size());

       // Is set empty?
       System.out.println("Is the set empty? " + numbers.isEmpty());

       // Clear the set
       numbers.clear();
       System.out.println("Set after clearing: " + numbers);
		
		
		

	}

}
