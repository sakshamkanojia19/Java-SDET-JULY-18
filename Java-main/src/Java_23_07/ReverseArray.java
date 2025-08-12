package Java_23_07;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,10,20,30,50};
		
		System.out.println("Original Array: ");
		
		for(int val : arr) {
			System.out.println(val + " ");
		}
		
		//reversing the array in place
		
		int start = 0; 
		int end = arr.length -1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

        System.out.print("\nReversed Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
	}

}
