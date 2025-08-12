package MutliThreading_Ex;

import java.util.Arrays;

class SortThread extends Thread{
	int[] array;
	
	
	public SortThread(int[] array) {
		this.array = array;
	}
	
	public void run() {
		Arrays.sort(array);
	}
}



public class MultiThreadSort {

	public static void main(String[] args) throws InterruptedException {
		int[] arr = {5,8,1,3,9,2,4,7};
		
		int mid = arr.length/2;
		
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		
		   SortThread t1 = new SortThread(left);
	        SortThread t2 = new SortThread(right);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();
		
	        
	        
	        //Merge two sorted halvs
	        
	        int[] sorted = new int[arr.length];
	        int i = 0, j = 0, k = 0;
	        while (i < left.length && j < right.length) {
	            sorted[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
	        }
	        while (i < left.length) sorted[k++] = left[i++];
	        while (j < right.length) sorted[k++] = right[j++];

	        System.out.println("Sorted array: " + Arrays.toString(sorted));

	}

}









/*
 * Inbuilt easy method of parallel sorting
 * 
 * 
 * import java.util.Arrays;

public class ParallelSortingExample {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 2, 1, 9, 3, 7, 6, 4};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Use parallelSort to sort the array using multiple threads
        Arrays.parallelSort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
 * 
 * */



/*
 * 2 ways sorting
 * 
 * 
 * 
 * // 3.sort an integer array using multiple threads.
 
import java.util.Arrays;
 
class merge extends Thread {
    int[] arr;
    int start, end;
 
    public merge(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
 
    public void run() {
        Arrays.sort(arr, start, end);
    }
}
 
public class lab_prog27 {
    public static void main(String[] args) throws InterruptedException  {
        int[] arr = {9, 4, 7, 1, 5, 3, 6, 2};
        
        int mid = arr.length / 2;
        merge t1 = new merge(arr, 0, mid);
        merge t2 = new merge(arr, mid , arr.length);
 
        t1.start();
        t2.start();
 
        t1.join(); // main thread waits till your t1 thread executes essentially used for synchronization.
        t2.join(); // Without join(), the main thread may continue and execute the next lines before the
                   // child threads finish their work. This can lead to: Incomplete output ,Wrong result.
 
        System.out.println("array after individual sorting : "+ Arrays.toString(arr));
 
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        
        System.out.println("result array before sorting : " + Arrays.toString(result));
        
        Arrays.sort(result);
 
        System.out.println("result array after sorting : " + Arrays.toString(result));
    }
}
 
 * */
