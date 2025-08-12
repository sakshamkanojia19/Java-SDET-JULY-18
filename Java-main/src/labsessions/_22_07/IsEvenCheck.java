package labsessions._22_07;

public class IsEvenCheck {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 11;

        System.out.println(num1 + " is even: " + isEven(num1));
        System.out.println(num2 + " is even: " + isEven(num2));
    }
}
