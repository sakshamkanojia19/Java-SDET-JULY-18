package Collections_Exp;

import java.util.LinkedList;

public class Linked_lst_Example {
	//check serialize form

	public static void main(String[] args) {
		//It is same as arraylist
		// linkedList is doubly linkedlsit
		//Can insert data both the ends
		//can'nt do in ArrayList 
		//Creating of list, accessing data, updating data, removing data
		
		//Non sync not thread safe
		//Linkedlist is slower than Arraylist
		
		
		//Also can do dequeue
		
		
	       LinkedList<String> ls = new LinkedList<String>();

	        // Insertion of data
	        ls.add("Ravi");
	        ls.add("saksham");
	        ls.add("tina");
	        ls.add("Peter");
	        ls.add("Snajay");
	        ls.add("Rima");
	        ls.add("Ravi");   // Duplicate allowed
	        ls.add(null);     // null allowed

	        // Print entire list
	        System.out.println(ls);

	        // Get element at index 2
	        System.out.println(ls.get(2));

	        // Find index of "Peter"
	        System.out.println(ls.indexOf("Peter"));

	        // Check if list is empty
	        System.out.println(ls.isEmpty());

	        // Remove element at index 4
	        System.out.println(ls.remove(4));  // Removes "Snajay"

	        // Print list after removal
	        System.out.println(ls);

	        // Replace element at index 4 with "King"
	        System.out.println(ls.set(4, "King"));  // Replaces "Rima"

	        // Print list after set
	        System.out.println(ls);

	        // Print list iterator
	        System.out.println(ls.listIterator());

	        // Print size of list
	        System.out.println(ls.size());
		

	}

}
