//package Java_22_07;
//
//public class CheckPrime {
//
//	public boolean isPrime(int n) {
//		if(n<=1) {
//			return false;
//		}
//		
//		//check for factors
//		for(int i=2;i<=n/2;i++) {
//			if(n%i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		CheckPrime obj = new CheckPrime();
//		
//		int n = 20;
//		
//		boolean result = obj.isPrime(n);
//		
//		if (result) {
//            System.out.println(n+ " is a Prime Number.");
//        } else {
//            System.out.println(n + " is NOT a Prime Number.");
//        }
//
//	}
//
//}


//way 2 


package Java_22_07;

public class CheckPrime {

    // Method to check if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check for factors
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckPrime obj = new CheckPrime();

        // Check multiple numbers
        obj.checkAndPrint(20);
        obj.checkAndPrint(51);
        obj.checkAndPrint(17);
        obj.checkAndPrint(2);
    }

    // Helper method to print result for a given number
    public void checkAndPrint(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}
