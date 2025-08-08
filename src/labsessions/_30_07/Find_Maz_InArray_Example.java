package labsessions._30_07;

import java.util.ArrayList;
import java.util.Collections;

public class Find_Maz_InArray_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
//		 // Step 1: Create an ArrayList and add integers manually
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(45);
//        numbers.add(12);
//        numbers.add(78);
//        numbers.add(23);
//        numbers.add(90);
//
//        // Step 2: Print the original list
//        System.out.println("ArrayList: " + numbers);
//
//        // Step 3: Check if list is not empty
//        if (numbers.isEmpty()) {
//            System.out.println("List is empty. Cannot find maximum.");
//            return;
//        }
//
//        // Step 4: Use Collections.max() to find the largest element
//        int max = Collections.max(numbers);
//
//        // Step 5: Print the result
//        System.out.println("Maximum Element: " + max);
		
		
		  ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(45);
	        numbers.add(12);
	        numbers.add(78);
	        numbers.add(23);
	        numbers.add(90);

	        // Step 2: Check if the list is empty
	        if (numbers.isEmpty()) {
	            System.out.println("List is empty. Cannot find maximum.");
	            return;
	        }

	        // Step 3: Initialize max with the first element
	        int max = numbers.get(0);

	        // Step 4: Loop through the list to find the max
	        for (int i = 1; i < numbers.size(); i++) {
	            if (numbers.get(i) > max) {
	                max = numbers.get(i);
	            }
	        }

	        // Step 5: Output the result
	        System.out.println("ArrayList: " + numbers);
	        System.out.println("Maximum Element: " + max);
		
	}

}
