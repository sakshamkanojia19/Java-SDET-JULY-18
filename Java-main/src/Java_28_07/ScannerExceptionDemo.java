package Java_28_07;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionDemo {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            // ArithmeticException
	            System.out.print("Enter numerator: ");
	            int num = sc.nextInt();

	            System.out.print("Enter denominator: ");
	            int den = sc.nextInt();

	            int result = num / den;
	            System.out.println("Result: " + result);

	            // StringIndexOutOfBoundsException
	            System.out.print("Enter a word: ");
	            String word = sc.next(); // Single token word

	            System.out.print("Enter index to access character: ");
	            int index = sc.nextInt();

	            char ch = word.charAt(index);
	            System.out.println("Character at index " + index + ": " + ch);

	            // InputMismatchException
	            System.out.print("Enter your age (as an integer): ");
	            int age = sc.nextInt();
	            System.out.println("Your age is: " + age);

	        } 
	        catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        } 
	        catch (InputMismatchException e) {
	            System.out.println("InputMismatchException: Please enter the correct type of input.");
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException: Invalid index for the entered string.");
	        } 
	        catch (Throwable e) {
	            System.out.println("General Exception: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("Closing Scanner.");
	            sc.close();
	        }

	        System.out.println("Program ended gracefully.");
	    }
	
}
