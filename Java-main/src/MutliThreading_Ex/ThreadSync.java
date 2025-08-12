package MutliThreading_Ex;

public class ThreadSync {

	
	private int c = 0; //shared variable
	
	//sync method to increment the counter
	
	public synchronized void inc() {
		c++;
		
	}
	//sync method to get counter value
	public synchronized int get() {
		return c;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
