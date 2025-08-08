package Java_28_07;

public class DemoValidate  {

	public void checkAge(int age)throws Custome_Excep {
	
		if(age>=18 ) {
		
			Custome_Excep ve = new Custome_Excep("Valid age");
		   throw(ve);
		}
		else {
			Custome_Excep ave = new Custome_Excep("Invalid age");
			throw(ave);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		
		int age = sc.nextInt();
		
		
		
	}

}
