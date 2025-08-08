package college;

public class Student {
    // private variables
    private String name = "Alice";
    private String studentId = "S12345";
    private String department = "Computer Science";

    // private method
    private void displayStudentInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Student ID: " + studentId);
//        System.out.println("Department: " + department);
    	System.out.println("Student: " + name + ", ID: " + studentId + ", Dept: " + department);
    }
 
    

    
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudentInfo(); // accessible inside the same class
    }




	public void accessPrivate() {
		// TODO Auto-generated method stub
        displayStudentInfo();  // ✅ Accessible inside class

		
	}
}
