package java1;

public class ParameterizedMethods {

    // Addition of two integers
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition: " + c);
    }

    // Multiplication of two integers
    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication: " + c);
    }

    // Subtraction of two integers
    public void sub(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction: " + c);
    }

    // Division of two integers
    public void div(int a, int b) {
        if (b != 0) {
            double c = (double) a / b;
            System.out.println("Division: " + c);
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    // Overloaded method: Multiplication of a double value (for the case p1.mul(10.5);)
    public void mul(double a) {
        double c = a * a;
        System.out.println("Square (double): " + c);
    }

    public static void main(String[] args) {

        // Sending data as parameter
        ParameterizedMethods p1 = new ParameterizedMethods();

        p1.add(5, 40);
        p1.add(-6, 8);
        p1.sub(45, 30);
        p1.mul(10, 5);
        p1.mul(10.5); // using overloaded method
        p1.div(2, 5);
    }
}
