package Package1;

public class SamePackSubClass extends Class1{
	
	public void read() {
		
		System.out.println("Reading in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		SamePackSubClass obj = new SamePackSubClass();
		
		obj.display();   //inherited
		obj.read(); //own method
		obj.fetchemployeeID();
		 obj.showDepartment(); 
	}

}
