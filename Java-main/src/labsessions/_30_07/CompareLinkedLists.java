package labsessions._30_07;

import java.util.LinkedList;

public class CompareLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Step 1: Create two LinkedLists
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");

        // Step 2: Print the lists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Step 3: Compare using equals()
        if (list1.equals(list2)) {
            System.out.println(" The two LinkedLists are equal.");
        } else {
            System.out.println("The two LinkedLists are NOT equal.");
        }
		 
	}

}
