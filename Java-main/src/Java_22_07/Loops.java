package Java_22_07;

public class Loops {

	public static void main(String[] args) {
	
		 //for loop
		for(int i= 1; i< 10;i++) {
			System.out.println(i);
		}
		
		//print from 10 - 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}

		
		
		//while loop
	     // depending on condition execute until Specified boolean condition true
		
		int j = 1;
	    while(j<= 10) {
	    	System.out.println(j);
	    	j++;
	    }
	    
	    //do while
	    
	    int k = 8;
	    
	    do {
	    	System.out.println(k); //execute Atleast one time then check condtions
	    	k++;
	    } while (k<=10);
		
		
	}

}
