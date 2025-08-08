package Java_22_07;

public class Static_Vars {

	
//	 No need to create var declared at classs level with static, both are class level
	
	public static String studentname = "Saksham";
	
	public String studentaddress = "MG Road";
	
	public static int studentid = 787;
	
	
	
	
	public static void main(String[] args) {
		
       Static_Vars sv = new Static_Vars();
       
       
       System.out.println(studentname);
       System.out.println(studentid);
      
//       access non static var
       
       
      System.out.println(sv.studentaddress);
		
	}

}
