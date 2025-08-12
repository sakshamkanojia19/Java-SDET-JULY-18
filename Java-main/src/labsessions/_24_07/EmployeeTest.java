package labsessions._24_07;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
//abstact method
    abstract double calculateSalary();
}

//subclass
class PermanentEmployee extends Employee {
    private double monthlySalary;

    public PermanentEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

//subclass
class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee perm = new PermanentEmployee("Alice", 101, 5000);
        Employee contract = new ContractEmployee("Bob", 102, 20, 120);

        System.out.println(perm.name + "'s Salary: " + perm.calculateSalary());
        System.out.println(contract.name + "'s Salary: " + contract.calculateSalary());
    }
}