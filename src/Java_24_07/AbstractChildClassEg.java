package Java_24_07;

public class AbstractChildClassEg extends Abstract_Classes{

	
	@Override
	void makesound() {
		System.out.println("Animal Make sound");
	}
	
	public static void main(String[] args) {
		AbstractChildClassEg obj = new AbstractChildClassEg();
		
		obj.eat();
		obj.makesound();
		System.out.println(AnimalName);
//		System.out.println(obj.animalbhevaipur);  private

	}

}
