package MutliThreading_Ex;

public class UseSyncClass {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadSync cnt  = new ThreadSync();
		
		//Thread 1 to Increment the counter
		
		Thread t1 = new Thread(()->{
			for (int i=0;i<1000;i++) {
				cnt.inc();
			}
		});
		
		
		Thread t2 = new Thread(()->{
			for (int i=0;i<1000;i++) {
				cnt.inc();
			}
		});
		
		
		//start both the starts
		t1.start();
		t2.start();
		
		//Control threads synchronisation using join and more
		//Wait for the threads to finish
		
		t1.join();
		t2.join();
		
		
		//Print the final counter value 
		
		System.out.println("Counter: "+ cnt.get());
		
	}

}
