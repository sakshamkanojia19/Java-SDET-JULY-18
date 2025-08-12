package labsessions._23_07;

public class Shape {

	 double getArea() {
	        return 0;
	    }
}




class Rectangle extends Shape {
    int length = 5;
    int width = 3;

    @Override
    double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle: " + rect.getArea()); // Output: 15
    }
}