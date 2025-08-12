package Java_29_07;

public class ThrowExp {

	public static void checkAge(int age) throws Exception {
		if(age<18) {
			System.out.println("Create a new exception");
			//using throw key word
			
			throw new Exception("Age must be 18 or older to vote ");
		} else {
			System.out.println("Person is not eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		
   //Creating of the custom exception
	//can use java existing exception template but can define your custom exceptions.
	
	//call method by creating object
		
		ThrowExp obj = new ThrowExp();
//		
//		obj.checkAge(15);
		
		try {
	        ThrowExp.checkAge(15);  // throws Exception
	    } catch (Exception e) {
	        System.out.println("Exception caught: " + e.getMessage());
	    }
		
		
	}

}
