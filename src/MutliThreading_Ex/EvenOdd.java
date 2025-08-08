package MutliThreading_Ex;


class EvenThread extends Thread{
	public void run() {
		for(int i = 2;i<=100;i+=2) {
			System.out.println("Even "+i);
		}
	}
}

class OddThread extends Thread{
	public void run() {
		for(int i=1;i<=100;i+=2) {
			System.out.println("Odd "+i);
		}
	}
}




public class EvenOdd {

	public static void main(String[] args) {
//		new EvenThread().start();
//		new OddThread().start();
	
	//also create simple method 
		
		EvenThread et = new EvenThread();
		OddThread
	}

}
