//package Testing_Cases;
//
//public class Boundry_Val_Analysis {
//
//    // Validations
//    public static boolean isValidName(String name) {
//        return name != null && name.length() <= 16;
//    }
//
//    public static boolean isValidAge(int age) {
//        return age >= 18 && age <= 60;
//    }
//
//    public static boolean isValidPersonalNumber(String number) {
//        return number != null && number.matches("\\d{10}");
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("=== Name Field (Max 16 Characters) ===");
//        testName(""); // Just below minimum (still valid for 0 chars)
//        testName("A"); // Minimum boundary
//        testName("JohnDoe123"); // Nominal
//        testName("abcdefghijklmnop"); // Maximum boundary (16 chars)
//        testName("abcdefghijklmnopq"); // Just above maximum (17 chars)
//
//        System.out.println("\n=== Age Field (18 to 60) ===");
//        testAge(17); // Just below minimum
//        testAge(18); // Minimum boundary
//        testAge(30); // Nominal
//        testAge(60); // Maximum boundary
//        testAge(61); // Just above maximum
//
//        System.out.println("\n=== Personal Number Field (Exactly 10 digits) ===");
//        testPersonalNumber("123456789");   // Just below minimum (9 digits)
//        testPersonalNumber("1234567890");  // Exact 10 digits (valid)
//        testPersonalNumber("12345678901"); // Just above maximum (11 digits)
//        testPersonalNumber("12345abc90");  // Invalid characters
//        testPersonalNumber("");            // Empty string (invalid)
//    }
//
//    // Test Methods
//    public static void testName(String name) {
//        if (isValidName(name)) {
//            System.out.println("Name \"" + name + "\" is VALID.");
//        } else {
//            System.out.println("Name \"" + name + "\" is INVALID.");
//        }
//    }
//
//    public static void testAge(int age) {
//        if (isValidAge(age)) {
//            System.out.println("Age " + age + " is VALID.");
//        } else {
//            System.out.println("Age " + age + " is INVALID.");
//        }
//    }
//
//    public static void testPersonalNumber(String number) {
//        if (isValidPersonalNumber(number)) {
//            System.out.println("Personal Number \"" + number + "\" is VALID.");
//        } else {
//            System.out.println("Personal Number \"" + number + "\" is INVALID.");
//        }
//    }
//}






// By user Input


package Testing_Cases;

import java.util.Scanner;

public class Boundry_Val_Analysis {

    // Validation Methods
    public static boolean isValidName(String name) {
        return name != null && name.length() <= 16;
    }

    public static boolean isValidAge(int age) {
        return age >= 18 && age <= 60;
    }

    public static boolean isValidPersonalNumber(String number) {
        return number != null && number.matches("\\d{10}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Name Input
        System.out.print("Enter Name (max 16 characters): ");
        String name = scanner.nextLine();
        if (isValidName(name)) {
            System.out.println("✅ Name is VALID");
        } else {
            System.out.println("❌ Name is INVALID (Must be <= 16 characters)");
        }

        // Get Age Input
        System.out.print("Enter Age (18 to 60): ");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (isValidAge(age)) {
                System.out.println("✅ Age is VALID");
            } else {
                System.out.println("❌ Age is INVALID (Must be between 18 and 60)");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Age must be a number");
        }

        // Get Personal Number Input
        System.out.print("Enter Personal Number (10-digit number): ");
        String personalNumber = scanner.nextLine();
        if (isValidPersonalNumber(personalNumber)) {
            System.out.println("✅ Personal Number is VALID");
        } else {
            System.out.println("❌ Personal Number is INVALID (Must be exactly 10 digits)");
        }

        scanner.close();
    
}


}


/*
 * 
 * 
 * Name - Valid range - 1-16 Characters - Boundary values - 0,1,2,8,15,16,17
 
Age -- valid range - 18-60 -- Boundary values -- 17,18,19,34,59,60,61
 
Personal Number - Exactly 10 digits -- Boundary values - 9 digits,10digits,non-numeric
 * */






/*
 * 
 * 
 * Perfect! You're referring to a standard Boundary Value Analysis (BVA) testing formula, which involves testing:

Invalid (min - 1)

Valid (min, min + 1)

Valid (nominal / mid value)

Valid (max - 1, max)

Invalid (max + 1)

🧠 Let's Apply This Formula to Each Field
✅ 1. Age Field (Valid range: 18–60)
Use BVA formula:
[min - 1, min, min+1, nominal, max -1, max, max + 1]

Test Type	Value	Expected
Invalid (min - 1)	17	❌ Invalid
Valid (min)	18	✅ Valid
Valid (min + 1)	19	✅ Valid
Valid (nominal)	37	✅ Valid
Valid (max - 1)	59	✅ Valid
Valid (max)	60	✅ Valid
Invalid (max + 1)	61	❌ Invalid

✅ 2. Name Field (Max 16 characters)
Assume nominal = 8 characters

Test Type	Input	Expected
Invalid (min - 1)	null or not entered	❌ Invalid
Valid (min)	"" (0 chars)	✅ Valid
Valid (min + 1)	"A" (1 char)	✅ Valid
Valid (nominal)	"JohnSmith" (9 chars)	✅ Valid
Valid (max - 1)	15 characters	✅ Valid
Valid (max)	16 characters	✅ Valid
Invalid (max + 1)	17 characters	❌ Invalid

✅ 3. Personal Number Field (Exactly 10 digits)
This is a fixed length field, so BVA focuses on:
[length -1, exact, length +1]

Test Type	Input	Expected
Invalid (min - 1)	9 digits	❌ Invalid
Valid (exact)	10 digits	✅ Valid
Invalid (max + 1)	11 digits	❌ Invalid
Invalid (non-numeric)	"12345abc90"	❌ Invalid

✅ Summary (Quick Format):
Field	Valid Range	BVA Test Values
Age	18–60	17 ❌, 18 ✅, 19 ✅, 37 ✅, 59 ✅, 60 ✅, 61 ❌
Name	Max 16 characters	null ❌, "" ✅, 1 char ✅, 9 chars ✅, 15 ✅, 16 ✅, 17 ❌
Personal No.	Exactly 10 digits	9 digits ❌, 10 ✅, 11 ❌, non-digit ❌
 * 
 * */
