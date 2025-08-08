package java1;

public class CircleArea {

    // Parameterized method to calculate area of a circle
//	i am taking double cause radius could be in decimal
    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        CircleArea c1 = new CircleArea();
        
        // Passing radius as a parameter
        c1.calculateArea(5);
        c1.calculateArea(10.75);
    }
}
