package MutliThreading_Ex;

public class ThreadRunnableChild {

	public static void main(String[] args) {
		
		
		int n = 10;
		for(int i = 0;i<n;i++) {
			Thread object  = new Thread(new ThreadUsingRunnableInterface());
			
			object.start();
		}

	}

}
