package Java_25_07;

public class Encapsu_Employee {
	 // Private fields (encapsulation)
    private String name;
    private int id;
    private double salary;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("❌ Invalid salary. Must be positive.");
        }
    }

    // Getter for salary (optional)
    public double getSalary() {
        return salary;
    }

    // Display method
    public void displayDetails() {
        System.out.println("👤 Employee ID: " + id);
        System.out.println("👤 Name: " + name);
        System.out.println("💰 Salary: " + salary);
    }

    // Main for testing
    public static void main(String[] args) {
    	Encapsu_Employee e1 = new Encapsu_Employee();
        e1.setName("Alice");
        e1.setId(101);
        e1.setSalary(50000);  // Valid
        e1.displayDetails();

        System.out.println("--------");

        Encapsu_Employee e2 = new Encapsu_Employee();
        e2.setName("Bob");
        e2.setId(102);
        e2.setSalary(-3000);  // Invalid
        e2.displayDetails();
    }
}
