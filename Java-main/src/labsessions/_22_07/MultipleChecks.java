package labsessions._22_07;

public class MultipleChecks {

	//1 Check if number is positive
	
	
	public void checkNumberSign(int number) {
		   if (number > 0) {
	            System.out.println(number + " is Positive.");
	        } else if (number < 0) {
	            System.out.println(number + " is Negative.");
	        } else {
	            System.out.println(number + " is Zero.");
	        }
	}
	
	//check if number is Even or odd
	
	public void checkEvenOdd(int number) {
		  if (number % 2 == 0) {
	            System.out.println(number + " is Even.");
	        } else {
	            System.out.println(number + " is Odd.");
	        }
	}
	
	
	//3 Grade calculator
	
	  public void calculateGrade(int marks) {
	        if (marks >= 90 && marks <= 100) {
	            System.out.println("Grade: A");
	        } else if (marks >= 75 && marks <= 89) {
	            System.out.println("Grade: B");
	        } else if (marks >= 60 && marks <= 74) {
	            System.out.println("Grade: C");
	        } else if (marks >= 40 && marks <= 59) {
	            System.out.println("Grade: D");
	        } else if (marks < 40 && marks >= 0) {
	            System.out.println("Grade: Fail");
	        } else {
	            System.out.println("Invalid Marks Entered.");
	        }
	    }
	
	
	public static void main(String[] args) {
 
		//object creation and multiple checks
		
		 MultipleChecks obj = new MultipleChecks();

	        System.out.println("=== Number Sign Check ===");
	        obj.checkNumberSign(0);
	        obj.checkNumberSign(25);
	        obj.checkNumberSign(-12);

	        System.out.println("\n=== Even or Odd Check ===");
	        obj.checkEvenOdd(10);
	        obj.checkEvenOdd(7);

	        System.out.println("\n=== Grade Calculator ===");
	        obj.calculateGrade(95);
	        obj.calculateGrade(81);
	        obj.calculateGrade(67);
	        obj.calculateGrade(45);
	        obj.calculateGrade(22);
	        obj.calculateGrade(-5);
		 

	}

}
