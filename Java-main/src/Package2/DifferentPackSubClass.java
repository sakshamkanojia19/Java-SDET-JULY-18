package Package2;

import Package1.Class1;

public class DifferentPackSubClass extends Class1 {

	public void write() {
	System.out.println("Creating in sub class in differnt packsub class");
	}
	
	public static void main(String[] args) {
	 
		DifferentPackSubClass obj = new DifferentPackSubClass();
		
		obj.write(); //own method
		obj.display(); //inherited
		
//		from class1 not able to print in other package 
//		obj.fetchemployeeID();
		
		//Protecteed from Class1
		
		 obj.showDepartment(); 
   
	}

}
