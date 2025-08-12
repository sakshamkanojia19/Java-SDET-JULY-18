package labsessions._25_07;

public class Triangle implements Shape{
 
	private double base, height;
	 
	 public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

//	    @Override
	    public double getArea() {
	        return 0.5 * base * height;
	    }
	    
	    public class MainRun {
	        public static void main(String[] args) {
	            Shape rectangle = new Rectangle(5, 4);
	            Shape circle = new Circle(3);
	            Shape triangle = new Triangle(6, 2);

	            System.out.println("Rectangle Area: " + rectangle.getArea());
	            System.out.println("Circle Area: " + circle.getArea());
	            System.out.println("Triangle Area: " + triangle.getArea());
	        }
	    
}
}
