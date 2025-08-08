package Java_25_07;

public class CircleClass implements CircleShape{

	//Interface Inheritance
//	Multilevel Inheritance
	
	//method comming from circleshape interface
	public void radius() {
	System.out.println("Radius is 5 Units");
	}
	
	
	//method comming from interface shape
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 CircleClass c = new CircleClass();
		 
		 c.draw();
		 c.radius();
	}

}
