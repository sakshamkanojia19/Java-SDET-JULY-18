package customers;

public class Customer {
    // protected variables
    protected String name = "Emma";
    protected String customerId = "C33333";
    protected String department = "Retail";

    // protected method
    protected void displayCustomerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Department: " + department);
        
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.displayCustomerInfo(); // accessible in same class or subclass
    
    }
}
