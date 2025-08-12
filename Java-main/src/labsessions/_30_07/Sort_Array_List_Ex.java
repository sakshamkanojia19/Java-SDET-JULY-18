package labsessions._30_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Array_List_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Step 1: Create an ArrayList with some integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(50, 10, 40, 30, 20));

        // Print before sorting
        System.out.println("Before Sorting: " + numbers);

        // Step 2: Sort the list in ascending order
        Collections.sort(numbers);

        // Print after sorting
        System.out.println("After Sorting (Ascending): " + numbers);
        //for decending
        
        Collections.sort(numbers, Collections.reverseOrder());

        
        System.out.println("Decending:"+ numbers );
		
		
	}

}
