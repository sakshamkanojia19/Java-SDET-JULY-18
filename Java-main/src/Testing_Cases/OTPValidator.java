package Testing_Cases;

import java.util.Scanner;

public class OTPValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter OTP (must include 6 digits): ");
        String input = scanner.nextLine();
        
        try {
            // Check if input is a 6-digit number
            int otp = Integer.parseInt(input);
            
            // Validate the OTP
            if (input.length() == 6 && otp > 100000 && otp < 999999) {
                System.out.println("Valid OTP: Access granted.");
            } else {
                System.out.println("Invalid OTP: Please enter a valid 6-digit number greater than 100000 and less than 999999.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid OTP: Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}