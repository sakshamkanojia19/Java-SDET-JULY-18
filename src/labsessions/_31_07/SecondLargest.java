package labsessions._31_07;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] nums = {10,30,40,99,1,200,900,10};
	
		Arrays.sort(nums);
		
		int secondLargest = nums[nums.length-2];
		
		System.out.println("Second largest "+ secondLargest);
	
	}

}
