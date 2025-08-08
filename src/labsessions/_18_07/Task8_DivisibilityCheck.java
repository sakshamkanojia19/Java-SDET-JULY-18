package labsessions._18_07;

public class Task8_DivisibilityCheck {

	public void checkDivisibility(int number) {
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 11");
        }
    }

    public static void main(String[] args) {
        Task8_DivisibilityCheck obj = new Task8_DivisibilityCheck();
        obj.checkDivisibility(55);
        obj.checkDivisibility(50);
    }

}
