package company;

public class Employee {
    // public variables
    public String name = "John";
    public String employeeId = "E98765";
    public String department = "HR";

    // public method
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayEmployeeInfo(); // accessible anywhere
    }
}
