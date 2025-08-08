package labsessions._25_07;

public class CurrentAccount implements Account{

	private double balance;
    private double overdraftLimit = 500;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest on current account
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void showOverdraftLimit() {
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
	 
}
