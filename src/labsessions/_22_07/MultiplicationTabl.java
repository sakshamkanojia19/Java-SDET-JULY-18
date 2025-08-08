package labsessions._22_07;
import java.util.Scanner;


public class MultiplicationTabl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to print its multiplication table: ");
	        int num = scanner.nextInt();

	        System.out.println("Multiplication Table of " + num + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	        scanner.close();
		
	}

}
