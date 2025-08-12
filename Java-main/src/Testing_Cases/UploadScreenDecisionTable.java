package Testing_Cases;

import java.util.Scanner;
public class UploadScreenDecisionTable {

	
	 // Method to validate upload based on format and size
    public static boolean isUploadAllowed(String fileName, int fileSizeInKB) {
        boolean isPng = fileName.toLowerCase().endsWith(".png");
        boolean isSizeValid = fileSizeInKB < 25;

        // Decision table logic:
        // Allow upload only if both format is .png AND size < 25 KB
        return isPng && isSizeValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file name
        System.out.print("Enter the file name (e.g., image.png): ");
        String fileName = scanner.nextLine();

        // Get file size
        System.out.print("Enter file size in KB: ");
        int fileSizeInKB = scanner.nextInt();

        // Check if upload is allowed
        if (isUploadAllowed(fileName, fileSizeInKB)) {
            System.out.println("✅ Upload Allowed.");
        } else {
            System.out.println("❌ Upload Rejected.");
        }

        scanner.close();
    }
}



/*
 *
 * To create a Decision Table for the Upload Screen based on the given specification, you follow these steps:

✅ Step 1: Identify Conditions (Inputs)
From your specification:

File Format is .png

File Size is less than 25 KB

✅ Step 2: Identify Actions (Outputs)
Allow Upload

Reject Upload

✅ Step 3: Create the Decision Table
Rule	File Format (.png)	File Size (< 25 KB)	Upload Allowed?
R1	✅ Yes	✅ Yes	✅ Yes
R2	✅ Yes	❌ No	❌ No
R3	❌ No	✅ Yes	❌ No
R4	❌ No	❌ No	❌ No

✅ Step 4: Logic Explanation
R1: Valid file format and size — ✅ Upload is allowed.

R2: Valid format but size too large — ❌ Reject.

R3: Wrong format but valid size — ❌ Reject.

R4: Wrong format and large size — ❌ Reject.

🧠 Final Business Rule:
Allow upload only if the file is in .png format AND its size is less than 25 KB.





 * 
 * 
 * */
 