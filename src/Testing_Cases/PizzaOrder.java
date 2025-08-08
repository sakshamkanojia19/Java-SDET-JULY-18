//package Testing_Cases;
//
//import java.util.Scanner;
//
//public class PizzaOrder {
//
//	public static void main(String[] args) {
//		
//	        Scanner scanner = new Scanner(System.in);
//	        int pizzasOrdered;
//
//	        System.out.print("Enter the number of pizzas you want to order: ");
//	        
//	        try {
//	            pizzasOrdered = Integer.parseInt(scanner.nextLine());
//
//	            if (pizzasOrdered >= 1 && pizzasOrdered <= 10) {
//	                System.out.println("Success: You have ordered " + pizzasOrdered + " pizza(s).");
//	            } else if (pizzasOrdered > 10 && pizzasOrdered <= 99) {
//	                System.out.println("Error: Only 10 pizzas can be ordered.");
//	            } else {
//	                System.out.println("Error: Invalid pizza quantity.");
//	            }
//	        } catch (NumberFormatException e) {
//	            System.out.println("Error: Please enter a valid number.");
//	        } finally {
//	            scanner.close();
//	        }
//
//	}
//
//}





package Testing_Cases;

import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pizzasOrdered;

        System.out.print("Enter the number of pizzas you want to order: ");
        
        try {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Error: Please enter a valid number.");
                return;
            }

            pizzasOrdered = Integer.parseInt(input);

            // Check for valid pizza orders
            if (pizzasOrdered >= 1 && pizzasOrdered <= 10) {
                System.out.println("Success: You have ordered " + pizzasOrdered + " pizza(s).");
            } else if (pizzasOrdered > 10 && pizzasOrdered < 100) {
                System.out.println("Error: Only 10 pizzas can be ordered.");
            } else {
                System.out.println("Error: Invalid pizza quantity.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}