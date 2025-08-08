package Testing_Cases;

public class PercentageValidator {

	  // Method to validate the percentage
    public static boolean isValidPercentage(int percentage) {
        return percentage >= 50 && percentage <= 90;
    }

    // Main method to test different cases
    public static void main(String[] args) {
        // Valid equivalence class (50–90 inclusive)
        testPercentage(50);   // boundary valid
        testPercentage(60);   // mid valid
        testPercentage(90);   // boundary valid

        // Invalid equivalence classes
        testPercentage(49);   // just below lower boundary
        testPercentage(0);    // extreme low
        testPercentage(91);   // just above upper boundary
        testPercentage(100);  // extreme high
        testPercentage(-10);  // negative input
    }

    // Helper method to print test result
    public static void testPercentage(int percentage) {
        if (isValidPercentage(percentage)) {
            System.out.println("Percentage " + percentage + "% is VALID.");
        } else {
            System.out.println("Percentage " + percentage + "% is INVALID.");
        }
    }
	 
}
