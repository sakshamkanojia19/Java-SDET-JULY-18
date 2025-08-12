package Testing_Cases;


// Flight reservation system state transition

import java.util.Scanner;

public class FlightReservationLogin {

	
	 public static void main(String[] args) {
	        final String CORRECT_PASSWORD = "agent123";
	        Scanner scanner = new Scanner(System.in);
	        int attempts = 0;
	        boolean accessGranted = false;

	        System.out.print("Enter Agent Name: ");
	        String agentName = scanner.nextLine();  // For future use if needed

	        while (attempts < 4) {
	            System.out.print("Enter Password (Attempt " + (attempts + 1) + "): ");
	            String input = scanner.nextLine();

	            if (input.equals(CORRECT_PASSWORD)) {
	                accessGranted = true;
	                break;
	            } else {
	                attempts++;
	                if (attempts < 4) {
	                    System.out.println("❌ Incorrect password. Try again.");
	                }
	            }
	        }

	        if (accessGranted) {
	            System.out.println("✅ Access Granted! Proceed to Reservation System.");
	            // Transition to reservation logic
	        } else {
	            System.out.println("❌ 4 incorrect attempts. Closing application.");
	        }

	        scanner.close();
	    }
}





/*
 * 
 * 
 * 
 * ✈️ Flight Reservation System – State Transition Design
🧩 Assumptions (Similar Flow):
User must log in with correct credentials (Agent Name & Password).

Gets 4 attempts max.

On correct password → goes to Reservation Access.

After 4 failed attempts → Application Closes.
 * 
 * Start
  ↓
1st Try → Correct → Access
  ↓ Incorrect
2nd Try → Correct → Access
  ↓ Incorrect
3rd Try → Correct → Access
  ↓ Incorrect
4th Try → Correct → Access
  ↓ Incorrect
Close Application




| **State**    | **Correct Password** | **Incorrect Password** | **Next State**              |
| ------------ | -------------------- | ---------------------- | --------------------------- |
| Start        | → First Try          |                        | S1                          |
| S1 (1st Try) | Access               | Next Try               | Access or S2                |
| S2 (2nd Try) | Access               | Next Try               | Access or S3                |
| S3 (3rd Try) | Access               | Next Try               | Access or S4                |
| S4 (4th Try) | Access               | Close Application      | Access or Close Application |

 * 
 * */
