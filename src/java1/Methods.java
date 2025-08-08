package java1;

public class Methods {

	
//	Data at class level
//	employee data
	
//	Gloabal vars or instance || class level vars scope is throughout class file
	public String employeename = "Saksham Kanojia";
	
	int employeeid = 1001;
	
	
//	methods display data declaration
	

//	define method like access specifier
	
	public void displayemployeedetails() {
		
//		using object calling 
		System.out.println(employeename);
		System.out.println(employeeid);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
//		object of above data from class level
		
//		create the object of the class to access the data and methods and cloud
		
		Methods obj = new Methods();
		
		obj.displayemployeedetails();
		
		 
		
		
	}

}
