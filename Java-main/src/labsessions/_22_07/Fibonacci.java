package labsessions._22_07;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}
