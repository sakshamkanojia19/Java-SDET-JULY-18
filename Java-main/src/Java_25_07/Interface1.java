package Java_25_07;

public interface Interface1 {
//Cause aLL implementing feature gonna work on child thats why it is public 
	//also we took interface in testing so that it can be accessible to users now
	
	//Abstract methods should be without in parent class like this one
	
	abstract void display();
	//not strict 
	//By default they taken as abstract method only it is rule of interface
	void read();
	
//	static void doing(); //not allowed also static method cannot override in subclass
//also abstract class not have body	
	static void write() {
		System.out.println("Writing in interface");
	}
	
	default void show() {
		System.out.println("Showing from interface1");
	}
	
	
//	default 
	

	
	//Internally it is taken as public static final String 
	String employeename = "Skasham kanoja";
public static final String employeeAdd = "16/5 Block MS";
	
	int employeeId = 6767;
	
	//cannot create constuctuors
//	Interface(){
//		
//	}
	
	//Cannot create object of interface
	
//	public static void main(String[] args) {
//		Interface1 it = new Interface1();
//	}
//	
	
	
	
}
