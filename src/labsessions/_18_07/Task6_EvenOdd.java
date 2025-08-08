package labsessions._18_07;

public class Task6_EvenOdd {

	  public void checkEvenOdd(int number) {
	        if (number % 2 == 0) {
	            System.out.println(number + " is Even");
	        } else {
	            System.out.println(number + " is Odd");
	        }
	    }

	    public static void main(String[] args) {
	        Task6_EvenOdd obj = new Task6_EvenOdd();
	        obj.checkEvenOdd(17);
	        obj.checkEvenOdd(18);
	    }
}
