package Char_Streams;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {
		//Key from keyboard we have scanner class 
		
		//Creating the scanner class

		Scanner scn = new Scanner(System.in);
		
		//enter your first name
		
		System.out.println("Enter the Fitst number");
		
		int a = scn.nextInt();
		
		System.out.println("Enter the Second number");
		
	 
		 int b = scn.nextInt();
		 
		 System.out.println("sum " + (a+b));
		 
		 scn.close();
	}

}
