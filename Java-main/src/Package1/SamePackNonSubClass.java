package Package1;

public class SamePackNonSubClass {
//no extends keyword
	
	public void write() {
		System.out.println("Writting in subclass in non subclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 obj = new Class1();
		
		SamePackNonSubClass obj1 = new SamePackNonSubClass();
		
		obj1.write();
		obj.display();
		obj.fetchemployeeID();
		 obj.showDepartment(); 
		 
	}

}
