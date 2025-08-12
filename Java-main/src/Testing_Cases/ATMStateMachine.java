package Testing_Cases;

import java.util.Scanner;
public class ATMStateMachine {

	
	// States
    enum State {
        START, FIRST_TRY, SECOND_TRY, THIRD_TRY, ACCESS_GRANTED, ACCOUNT_BLOCKED
    }

    public static void main(String[] args) {
        final String CORRECT_PIN = "1234";
        Scanner scanner = new Scanner(System.in);
        State currentState = State.START;
        int attempts = 0;

        System.out.println("Welcome to the ATM.");

        currentState = State.FIRST_TRY;

        while (true) {
            System.out.print("Enter PIN: ");
            String inputPin = scanner.nextLine();
            attempts++;

            switch (currentState) {
                case FIRST_TRY:
                    if (inputPin.equals(CORRECT_PIN)) {
                        currentState = State.ACCESS_GRANTED;
                    } else {
                        currentState = State.SECOND_TRY;
                    }
                    break;

                case SECOND_TRY:
                    if (inputPin.equals(CORRECT_PIN)) {
                        currentState = State.ACCESS_GRANTED;
                    } else {
                        currentState = State.THIRD_TRY;
                    }
                    break;

                case THIRD_TRY:
                    if (inputPin.equals(CORRECT_PIN)) {
                        currentState = State.ACCESS_GRANTED;
                    } else {
                        currentState = State.ACCOUNT_BLOCKED;
                    }
                    break;
			default:
				break;
            }

            // Final States
            if (currentState == State.ACCESS_GRANTED) {
                System.out.println("✅ Access Granted! You may proceed.");
                break;
            } else if (currentState == State.ACCOUNT_BLOCKED) {
                System.out.println("❌ Account Blocked due to 3 incorrect attempts.");
                break;
            }

            if (attempts == 1 && currentState == State.SECOND_TRY) {
                System.out.println("❌ Incorrect PIN. Try again (2 attempts left).");
            } else if (attempts == 2 && currentState == State.THIRD_TRY) {
                System.out.println("❌ Incorrect PIN. Last attempt remaining!");
            }
        }

        scanner.close();
    }
}



/*
 * State Transition Table
 * 
 * ATM SYSTEM
 * 
 * 
 * Example of State Transitions:
Correct on 1st try:
→ S1 → S2 → ✅ S5 (Access Granted)

Incorrect, then correct on 2nd:
→ S1 → S2 (wrong) → S3 → ✅ S5

Incorrect twice, then correct:
→ S1 → S2 → S3 (wrong) → S4 → ✅ S5

Incorrect all 3 times:
→ S1 → S2 → S3 → S4 → ❌ S6 (Blocked)




| **Current State** | **Input (Correct PIN)** | **Input (Incorrect PIN)** | **Next State**                     |
| ----------------- | ----------------------- | ------------------------- | ---------------------------------- |
| **S1 (Start)**    | —                       | —                         | S2 (1st Attempt)                   |
| **S2 (1st Try)**  | ✅ Correct PIN           | ❌ Incorrect PIN           | S5 (Access Granted) / S3 (2nd Try) |
| **S3 (2nd Try)**  | ✅ Correct PIN           | ❌ Incorrect PIN           | S5 (Access Granted) / S4 (3rd Try) |
| **S4 (3rd Try)**  | ✅ Correct PIN           | ❌ Incorrect PIN           | S5 (Access Granted) / S6 (Blocked) |
| **S5 (Granted)**  | —                       | —                         | Final (Success)                    |
| **S6 (Blocked)**  | —                       | —                         | Final (Failure)                    |

 * 
 * 
 * 
 * */
