package java1;

public class java_comments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
//		sample java comments
		/*
		 * multi line comments
		 * 
		 * 
		 * */
	
     
	     int a[] = {202};
	     int b[] = {20};
		 
		
	     int[] arr1 = {1, 2, 3}; // Declare and initialize the first array
	        int[] arr2 = {4, 5, 6}; // Declare and initialize the second array

	        // Create a third array to store the sum, ensuring it's the same size
	        int[] sumArr = new int[arr1.length];

	        // Iterate through the arrays, adding elements at each corresponding index
	        for (int i = 0; i < arr1.length; i++) {
	            sumArr[i] = arr1[i] + arr2[i]; // Perform the addition
	        }

	        // Print the elements of the sum array
	        System.out.println("Sum of the arrays:");
	        for (int i = 0; i < sumArr.length; i++) {
	            System.out.print(sumArr[i] + " ");
	        }
	        System.out.println(); 
	     
		 
	}

}
