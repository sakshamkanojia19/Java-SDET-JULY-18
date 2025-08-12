package labsessions._22_07;


import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first floating-point number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second floating-point number: ");
        double b = sc.nextDouble();

        // Multiply and cast to int for 2-decimal comparison
        if ((int)(a * 100) == (int)(b * 100)) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        sc.close();
    }
}
