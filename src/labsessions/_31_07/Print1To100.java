package labsessions._31_07;

public class Print1To100 {

    public static void main(String[] args) {
        print(1);  // Start recursion from 1
    }

    private static void print(int n) {
        if (n <= 100) {
            System.out.println(n); // ✅ Print before next call
            print(n + 1);          // ✅ Recursively call with next number
        }
    }
}
