package Java_23_07;

public class SingleDimensionArray {

	public static void main(String[] args) {
	    //singledimesionalarray
		
		int a[] = new int[5];
		//directly write
		String[] names  = {"Alice","Peter"};

		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
	// for loop to print elements of the array
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
   //access single element
		
		System.out.println(a[1]);
		
	}

}
