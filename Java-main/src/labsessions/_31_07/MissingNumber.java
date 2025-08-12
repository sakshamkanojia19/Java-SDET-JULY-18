package labsessions._31_07;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,6};
		
		int n = nums.length+1;
		
		int expectedSum = n*(n+1)/2;
		
		int actualSum = 0;
		
		for(int num : nums) {
			actualSum += num;
		}
		
		int missing = expectedSum-actualSum;
		
		System.out.println("Missing number "+missing);
		
	}

}
