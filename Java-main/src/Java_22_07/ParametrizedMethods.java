package Java_22_07;

public class ParametrizedMethods {
	
	//normal method with hardcoded data not reccommed on java
	 public void add () {
		 //local var and also can not use as static only is allowed static not in method vars 
		 int a = 7;
		 int b = 9;
		 int c = a+b;
		 
		 System.out.println(c);
	 }

	 //method with parameter
   
	 public void add(int a, int b) {
		 int c = a+b;
		 System.out.println(c);
	 }
	 
	public static void main(String[] args) {
		
		
		//object of class of mrthod
		
		ParametrizedMethods pm = new ParametrizedMethods();
		
		pm.add(7,9);
		pm.add(8,4);
		pm.add(-9,-3);

	}

}
