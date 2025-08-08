package labsessions._25_07;

public class Circle implements Shape {

	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

        @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	
}
