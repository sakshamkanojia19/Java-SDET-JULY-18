package labsessions._25_07;

public class MainBank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CurrentAccount current = new CurrentAccount(500);

        savings.deposit(3000);
        savings.applyInterest();  // Adds 4% interest

        current.withdraw(700);  // Overdraft allowed

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
    }

}
