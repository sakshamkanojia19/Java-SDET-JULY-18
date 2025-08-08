package MutliThreading_Ex;



class PrimeSumThread extends Thread{
	int start, end;
	int sum = 0;
	
	
	public PrimeSumThread(int start, int end) {
		this.start  = start;
		this.end = end;
	}
	
	private boolean isPrime(int n) {
		if(n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
	}
	
	 public void run() {
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) sum += i;
	        }
	    }
	
}


public class PrimeSumMain {

	public static void main(String[] args) throws InterruptedException {
	
		 PrimeSumThread t1 = new PrimeSumThread(1, 50);
	        PrimeSumThread t2 = new PrimeSumThread(51, 100);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        int totalSum = t1.sum + t2.sum;
	        System.out.println("Sum of primes from 1 to 100: " + totalSum);

	}

}
