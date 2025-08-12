package Collections_Exp;

import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;

public class Stack_Exp {

	public static void main(String[] args) {

//		Stack
		/*
		 * LIFO
		 * 
		 * 
		 * capacity also
		 * 5 methods operation
		 * 
		 * also inherits vector class
		 * vector methods also can be used in stack
		 * 
		 * 
		 * */
		
		
		// Stack of Strings - demonstrating inherited Vector methods
		Stack<String> nameStack = new Stack<>();

		// Add elements
		nameStack.add("saksham");
		nameStack.add("ravi");
		nameStack.add("kanojia");
		nameStack.addElement("arya");
		nameStack.add("neha");
		nameStack.add("kanojia");
		nameStack.add("saksham");
		nameStack.add("john");
		nameStack.add("doe");
		nameStack.add(null);
		nameStack.insertElementAt("insertedName", 2);

		System.out.println("Initial Stack (names): " + nameStack);

		// Access and modify elements
		System.out.println("Element at index 3: " + nameStack.elementAt(3));
		System.out.println("First element: " + nameStack.firstElement());
		System.out.println("Last element: " + nameStack.lastElement());
		System.out.println("Contains 'ravi': " + nameStack.contains("ravi"));
		System.out.println("Index of 'kanojia': " + nameStack.indexOf("kanojia"));
		System.out.println("Last Index of 'kanojia': " + nameStack.lastIndexOf("kanojia"));

		// Set and replace
		nameStack.setElementAt("updatedName", 4);
		nameStack.set(5, "anotherUpdate");

		System.out.println("After modifications: " + nameStack);

		// Remove by index and element
		nameStack.removeElement("saksham");
		nameStack.removeElementAt(2);
		nameStack.remove(3); // by index

		System.out.println("After removals: " + nameStack);

		// Clone and iterate
		@SuppressWarnings("unchecked")
		Stack<String> clonedStack = (Stack<String>) nameStack.clone();
		System.out.print("Cloned stack using Enumeration: ");
		Enumeration<String> en = clonedStack.elements();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();

		// Size and capacity
		System.out.println("Size: " + nameStack.size());
		System.out.println("Capacity: " + nameStack.capacity());
		System.out.println("Is Empty: " + nameStack.isEmpty());

		// Clear everything
		nameStack.removeAllElements();  // or nameStack.clear();
		System.out.println("After clear: " + nameStack);

		// -------------------------------
		// Stack of Integers - demonstrating Stack methods
		// -------------------------------
		Stack<Integer> numberStack = new Stack<>();

		numberStack.push(19);
		numberStack.push(101);
		numberStack.push(0);
		numberStack.push(12);
		numberStack.push(55);
		numberStack.push(101);
		numberStack.push(0);

		System.out.println("\nInitial Number Stack: " + numberStack);
		System.out.println("Top (peek): " + numberStack.peek());
		System.out.println("Pop: " + numberStack.pop());
		System.out.println("After pop: " + numberStack);
		System.out.println("Search for 101: " + numberStack.search(101));
		System.out.println("Search for 999 (not present): " + numberStack.search(999));
		System.out.println("Is Empty: " + numberStack.empty());

		// Additional Vector operations on number stack
		System.out.println("Element at index 1: " + numberStack.elementAt(1));
		numberStack.set(2, 888);
		System.out.println("After set at index 2: " + numberStack);
		System.out.println("Contains 888: " + numberStack.contains(888));

		Iterator<Integer> it = numberStack.iterator();
		System.out.print("Iterator output: ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
	}

}
