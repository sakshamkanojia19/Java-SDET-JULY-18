package testall;

// Import only public classes
import college.Student;
import company.Employee;
import customers.Customer;
// Can't import games.Game — it's package-private

// Extend Customer to test protected
public class TestAllAccess extends Customer {

    public static void main(String[] args) {
        // ✅ 1. Test Student (private members)
        System.out.println("=== Testing Student (Private Members) ===");
        Student stu = new Student();
        // stu.displayStudentInfo(); ❌ Private method - can't access
        stu.accessPrivate(); // ✅ Access through public method

        // ✅ 2. Test Employee (Public Members)
        System.out.println("\n=== Testing Employee (Public Members) ===");
        Employee emp = new Employee();
        System.out.println("Name: " + emp.name);       // ✅ public
        System.out.println("ID: " + emp.employeeId);   // ✅ public
        System.out.println("Dept: " + emp.department); // ✅ public
        emp.displayEmployeeInfo();                     // ✅ public method

        // ✅ 3. Test Customer (Protected Members via inheritance)
        System.out.println("\n=== Testing Customer (Protected Members via Inheritance) ===");
        TestAllAccess test = new TestAllAccess();
        test.displayCustomerInfo(); // ✅ protected method from subclass
        System.out.println("Name: " + test.name);      // ✅ protected field

        // ❌ 4. Test Game (Default Members - Not Accessible Outside Package)
        System.out.println("\n=== Testing Game (Default Access) ===");
        System.out.println("Game class can't be accessed from here because it's default (package-private).");
        // Game game = new Game(); ❌ ERROR - Cannot see class outside package
    }
}
