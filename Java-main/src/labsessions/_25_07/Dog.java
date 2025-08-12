package labsessions._25_07;

public class Dog implements Animal{

	@Override
	public void bark() {
		System.out.println("Dog is Barking");
	}
	
	 public static void main(String[] args) {
	        Dog d = new Dog();
	        d.bark();
	    }

}
