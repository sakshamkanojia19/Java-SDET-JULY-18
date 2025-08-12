package Java_25_07;

public class InterfaceChild implements Interface1 {


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying in child class");
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading in child class");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vars are static no need to create object
//		InterfaceChild ic = new 
		
		System.out.println(employeename);
		System.out.println(employeeId);
		System.out.println(employeeAdd);
		
		
		InterfaceChild obj = new InterfaceChild();
		
		obj.display();
		obj.read();
		Interface1.write();
		
		
		
	}

		
	}


