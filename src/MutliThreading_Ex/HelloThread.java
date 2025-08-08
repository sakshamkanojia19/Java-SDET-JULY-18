package MutliThreading_Ex;

public class HelloThread extends Thread{
   public void run() {
	   System.out.println("Hello World");
   }
	
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
		t1.start();
	}

}
