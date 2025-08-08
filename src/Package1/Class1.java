package Package1;

public class Class1 {
    //private var
	private static String employeeSalary = "5620202";
	//private method
	private void fetchsalary() {
		System.out.println("The employee salary is "+employeeSalary);
	}
	
	
	//Procted only not work with Fiiferent Package Non-subclass
	
	
	 // protected variable
    protected String department = "Engineering";

    // protected method
    protected void showDepartment() {
        System.out.println("Department: " + department);
    }
	
	
	
	//public method
	public void display() {
		System.out.println("Displaying the data class 1");
	}
	 
	//default var
	int employeeId = 77887;
	
	//default method
	
	void fetchemployeeID() {
		System.out.println("Employee ID is "+ employeeId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Class1 obj  = new Class1();
      obj.display();               // public method
      obj.fetchsalary();           // private method
      obj.fetchemployeeID();       // default method
      obj.showDepartment();        // protected method
      System.out.println("Accessing protected variable: " + obj.department);
	}

}
