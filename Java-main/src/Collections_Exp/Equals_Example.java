package Collections_Exp;

import java.util.Objects;

import company.Employee;

public class Equals_Example {
	
	
	int id;
	String name;
	
	Equals_Example(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	//Overriding equals () to compare the object the object content
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; //same reference
		if(obj == null || getClass() != obj.getClass()) return false;
		
		
		Employee other  = (Employee)Obj;
		return this.id == other.employeeId && this.name.equals(other.name);
	}
	
	
	@Override int hashCode() {
		return Objects.hash(id,name);
	}
	
	@Override
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
     * Equals Method
     * 
     * Equality of the objects and address to === or 
     *Refernce Equality and non reference equalityh 
     *
     *
     *Equals
     *
     *
     *
     * */
		
		
		
		
	}

}
