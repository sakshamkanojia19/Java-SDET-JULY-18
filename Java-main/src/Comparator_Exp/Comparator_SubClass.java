package Comparator_Exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Comparator_SubClass implements Comparator<Employee>{

	
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);	
		}
	
	
	
	public static void main(String[] args) {
		
	List<Employee> employees = new ArrayList<>();
		
	employees.add(new Employee(105, "Zoya"));
    employees.add(new Employee(101, "Amit"));
    employees.add(new Employee(104, "Bhavesh"));
    employees.add(new Employee(103, "Saksham"));
    employees.add(new Employee(102, "Liya"));
    employees.add(new Employee(106, "Nikita"));
    employees.add(new Employee(107, "Gaurav"));
	  // ✅ Use Comparator
   
    
    Collections.sort(employees, new Comparator_SubClass());
    System.out.println("Employees sorted by name (A-Z):");
    for (Employee e : employees) {
        System.out.println(e);
    }

    // ✅ Sort in descending order using reverse comparator
    Collections.sort(employees, new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e2.name.compareTo(e1.name); // Z-A
        }
    });

    System.out.println("\nEmployees sorted by name (Z-A):");
    for (Employee e : employees) {
        System.out.println(e);
    }
    
    
    //comparison in between
	}

}
