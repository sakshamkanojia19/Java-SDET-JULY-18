package Java_22_07;

public class ReturnType {

	//methpd returning value
	
	public void add1(int a,int b) {
		int c = a+b;
	}
	
	public int add2(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		ReturnType rt = new ReturnType();
		
		System.out.println(rt.add2(2,4));
		
	}

}
