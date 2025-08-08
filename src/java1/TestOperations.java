package java1;

public class TestOperations {
    public static void main(String[] args) {

        // Object of first class (Add, Subtract)
        MathOperations1 op1 = new MathOperations1();
        op1.add(10, 5);
        op1.sub(20, 7);

        // Object of second class (Multiply, Divide)
        MathOperations2 op2 = new MathOperations2();
        op2.mul(4, 6);
        op2.div(12, 4);
    }
}
