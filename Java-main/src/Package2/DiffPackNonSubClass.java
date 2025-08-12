package Package2;

import Package1.Class1;

public class DiffPackNonSubClass {

	public void printing() {
		System.out.println("Printing the data DiffPackNonSubClass ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Class1 obj  = new Class1();
		 DiffPackNonSubClass obj2 = new DiffPackNonSubClass();
		 
		 obj2.printing();
		 
	      obj.display();
//			from class1 not able to print in other package 
//			obj.fetchemployeeID();
	      
	   //   obj.showDepartment(); //not gonna work in non sub differnt pack 
}
}