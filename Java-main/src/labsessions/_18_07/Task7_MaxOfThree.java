package labsessions._18_07;

public class Task7_MaxOfThree {

	  public void findMax(int a, int b, int c) {
	        if (a >= b && a >= c) {
	            System.out.println("Maximum: " + a);
	        } else if (b >= a && b >= c) {
	            System.out.println("Maximum: " + b);
	        } else {
	            System.out.println("Maximum: " + c);
	        }
	    }

	    public static void main(String[] args) {
	        Task7_MaxOfThree maxObj = new Task7_MaxOfThree();
	        maxObj.findMax(40, 25, 39);
	        maxObj.findMax(40, 25, 99);
	    }

}
