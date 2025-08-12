package labsessions._22_07;

import java.util.Scanner;

public class MaxOfThree {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

	        if (a >= b && a >= c) {
	            System.out.println("Maximum is: " + a);
	        } else if (b >= a && b >= c) {
	            System.out.println("Maximum is: " + b);
	        } else {
	            System.out.println("Maximum is: " + c);
	        }
	 sc.close();
	 }
}