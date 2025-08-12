package java1;

public class MathOperations2 {
    
    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication: " + c);
    }

    public void div(int a, int b) {
        if (b != 0) {
            double c = (double) a / b;
            System.out.println("Division: " + c);
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}
