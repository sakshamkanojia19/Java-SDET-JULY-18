package Java_22_07;

//Save this entire code block as StudentInfoProgram.java
public class StudentInfoProgram {

 // Instance variables (non-static) - specific to each StudentInfoProgram object
 String studentName;
 int studentRollNumber;

 // Static variable (class variable / "global-like") - shared by all objects of this class
 public static String universityName = "My University";

 // Constructor to initialize the instance variables
 public StudentInfoProgram(String name, int rollNumber) {
     this.studentName = name;
     this.studentRollNumber = rollNumber;
 }

 // Method to display student information
 void displayStudentDetails() {
     // Accessing instance variables
     System.out.println("Student Name: " + studentName);
     System.out.println("Roll Number: " + studentRollNumber);
     // Accessing the static variable
     System.out.println("University: " + StudentInfoProgram.universityName);

     // Local variable (declared and used within this method)
     String enrollmentStatus = "Currently enrolled";
     System.out.println("Enrollment Status: " + enrollmentStatus);
     System.out.println(); // Add a blank line for readability
 }

 // Another method to demonstrate local variables and modification
 void updateStudentMajor(String newMajor) {
     // Local variable within this method
     String confirmationMessage = "Major updated for " + this.studentName;
     // In a real scenario, 'major' would likely be an instance variable.
     // For this example, let's simulate printing the change without
     // having a 'major' instance variable
     System.out.println(confirmationMessage);
     System.out.println("New Major: " + newMajor);
     System.out.println("This change is recorded at " + StudentInfoProgram.universityName);
     System.out.println();
 }

 public static void main(String[] args) {
     // Create objects (instances) of the StudentInfoProgram class
     StudentInfoProgram student1 = new StudentInfoProgram("Alice Brown", 1001);
     StudentInfoProgram student2 = new StudentInfoProgram("Charlie Green", 1002);

     System.out.println("--- Initial Student Information ---");
     student1.displayStudentDetails(); // Calling the method to display details
     student2.displayStudentDetails();

     // Demonstrating access and potential modification of the static variable
     // This change affects all instances because it's a class variable.
     StudentInfoProgram.universityName = "State College of Technology";
     System.out.println("--- After Changing University Name ---");
     student1.displayStudentDetails(); // Now shows "State College of Technology"
     student2.displayStudentDetails(); // Also shows "State College of Technology"

     // Calling a method that uses a local variable and a parameter
     System.out.println("--- Updating Student 1's Major ---");
     student1.updateStudentMajor("Cyber Security");
 }
}