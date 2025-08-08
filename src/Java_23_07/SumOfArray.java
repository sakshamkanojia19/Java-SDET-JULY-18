package Java_23_07;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {5,10,15,20};
		int sum = 0;
		
		for (int val : arr) {
            sum += val;
        }

        System.out.println("Sum of array elements: " + sum);
	}

}
