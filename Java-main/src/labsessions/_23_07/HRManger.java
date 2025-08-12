package labsessions._23_07;

public class HRManger extends Employee {
   
	  @Override
	    void work() {
	        System.out.println("HR Manager is recruiting");
	    }

	    void addEmployee() {
	        System.out.println("Adding a new employee");
	    }

	    public static void main(String[] args) {
	         HRManger hr = new HRManger ();
	        hr.work();             // Output: HR Manager is recruiting
	        System.out.println("Salary: " + hr.getSalary()); // Output: 30000
	        hr.addEmployee();      // Output: Adding a new employee
	    }
}
