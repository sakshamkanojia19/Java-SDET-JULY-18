package Java_23_07;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		//Row and column format MultidimensionalArray
		//It is in matrix format 3x3 matrix
		
		int arr[] [] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//2 for loops 1 for column and 1 for row
		
		for(int i = 0; i< 3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
