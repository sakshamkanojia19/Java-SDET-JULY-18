package Java_25_07;

public class Encapsulatoin_Class {

	
	//Private fields - hidden from outside access
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	
	
	//public setter
	
	public void setName(String name) {
		this.name = name;
		//this refers current class methods and vars
	}
	
	//public getAge
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		 
		Encapsulatoin_Class obj  = new Encapsulatoin_Class();
		
		obj.setAge(22);
		obj.setName("Saksham");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	 }
	
}
