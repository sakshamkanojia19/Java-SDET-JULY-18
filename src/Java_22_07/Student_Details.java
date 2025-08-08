package Java_22_07;


public class Student_Details {

    // Class-level variables (Global scope within this class)
    public String studentName = "Saksham Kanojia";
    int rollNumber = 07115003120;
    String course = "IT BTech";
    String university = "GGSIPU";

    // Method to display student information
    public void displayStudentInfo() {
        // Method prints class-level data
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
    }

    // main method to run the program
    public static void main(String[] args) {
        // Create object to access non-static members
        Student_Details studentObj = new Student_Details();
        
        // Call method to display details
        studentObj.displayStudentInfo();
    }
}
