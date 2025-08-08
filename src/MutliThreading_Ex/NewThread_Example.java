package MutliThreading_Ex;

 class NewThread_Example extends Thread{
 
	//create a thread using the thread class
	
		 
		 public void run() {
			 System.out.println("Thhread is running");
			 System.out.println("Thread is running: " + Thread.currentThread().getName());
	
		 }
	 
}

