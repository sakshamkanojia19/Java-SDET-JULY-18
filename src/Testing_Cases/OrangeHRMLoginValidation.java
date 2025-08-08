package Testing_Cases;

//public class OrangeHRMLoginValidation {
//
//    // Mock valid credentials (as per your screenshot)
//    private static final String VALID_USERNAME = "Admin";
//    private static final String VALID_PASSWORD = "admin123";
//
//    public static String login(String username, String password) {
//        if (username == null || username.trim().isEmpty()) {
//            return "Username is required";
//        }
//        if (password == null || password.trim().isEmpty()) {
//            return "Password is required";
//        }
//        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
//            return "Login successful";
//        } else {
//            return "Invalid credentials";
//        }
//    }
//
//    // Simulates clicking "Forgot Password?"
//    public static String forgotPasswordRedirect() {
//        return "Redirected to Forgot Password Page";
//    }
//
//    // ------------ Test Cases ------------
//    public static void main(String[] args) {
//        System.out.println("Test 1: Empty username and password");
//        System.out.println(login("", "")); // Expected: Username is required
//
//        System.out.println("\nTest 2: Empty username");
//        System.out.println(login("", "admin123")); // Expected: Username is required
//
//        System.out.println("\nTest 3: Empty password");
//        System.out.println(login("Admin", "")); // Expected: Password is required
//
//        System.out.println("\nTest 4: Invalid credentials");
//        System.out.println(login("WrongUser", "WrongPass")); // Expected: Invalid credentials
//
//        System.out.println("\nTest 5: Valid credentials");
//        System.out.println(login("Admin", "admin123")); // Expected: Login successful
//
//        System.out.println("\nTest 6: Forgot password link");
//        System.out.println(forgotPasswordRedirect()); // Expected: Redirected to Forgot Password Page
//    }
//}



/*
 * 
 * Test 1: Empty username and password
Username is required

Test 2: Empty username
Username is required

Test 3: Empty password
Password is required

Test 4: Invalid credentials
Invalid credentials

Test 5: Valid credentials
Login successful

Test 6: Forgot password link
Redirected to Forgot Password Page

*
*/
 




// Using Scanner Class

import java.util.Scanner;

public class OrangeHRMLoginValidation {

    // Mock valid credentials (as per your screenshot)
    private static final String VALID_USERNAME = "Admin";
    private static final String VALID_PASSWORD = "admin123";

    public static String login(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            return "Username is required";
        }
        if (password == null || password.trim().isEmpty()) {
            return "Password is required";
        }
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }

    // Simulates clicking "Forgot Password?"
    public static String forgotPasswordRedirect() {
        return "Redirected to Forgot Password Page";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== OrangeHRM Login Simulation ====");
        System.out.print("Enter Username (or type 'forgot' to simulate forgot password): ");
        String username = scanner.nextLine();

        // Simulate "Forgot Password?"
        if (username.equalsIgnoreCase("forgot")) {
            System.out.println(forgotPasswordRedirect());
            scanner.close();
            return;
        }

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Call login method
        String result = login(username, password);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

 
