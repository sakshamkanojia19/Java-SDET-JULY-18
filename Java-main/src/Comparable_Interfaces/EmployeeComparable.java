package Comparable_Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

	int id;
	String name;
	
	public EmployeeComparable(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	
	  @Override
	  public int compareTo(EmployeeComparable e) {
		  return this.name.compareTo(e.name);
	  }
	  
	  @Override
	  public String toString() {
		  return id+ " "+ name;
	  }
	
	public static void main(String[] args) {
		
		List<EmployeeComparable> employees = new ArrayList<>();
		
		 employees.add(new EmployeeComparable(103, "Saksham"));
	        employees.add(new EmployeeComparable(101, "zymit"));
	        employees.add(new EmployeeComparable(102, "Liya"));

	        Collections.sort(employees); // uses compareTo()

	        for (EmployeeComparable e : employees) {
	            System.out.println(e);
	        }
		
		
//		Java.lang
	}
	  
	
}
