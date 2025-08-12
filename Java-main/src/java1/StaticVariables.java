package java1;

public class StaticVariables {

	
//	Variables declared at class level with static keywords
//	no need to create object of the class
//	class level static var
	public static String studentname = "Saksham kanojia";
	public String college = "MSIT" + " 	GGSIPU";
	
	public static int studentid = 101;
	
	
	public static void main(String[] args) {
//	accessing static var	
		System.out.print(studentname);
		
		System.out.println(studentid);
		
		
		//accessing non static
		StaticVariables sv = new StaticVariables();
		
		System.out.println(sv.college);
    
//		single copy variaable
		
//		can we access static data in another class
	}

}
