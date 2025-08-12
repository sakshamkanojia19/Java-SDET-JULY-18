package labsessions._24_07;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract double calculateInterest();

    public void printBalance() {
        System.out.println("Balance for account " + accountNumber + ": " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.065;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", 10000);
        BankAccount fixed = new FixedDepositAccount("FD456", 20000);

        savings.printBalance();
        System.out.println("Savings Interest: " + savings.calculateInterest());

        fixed.printBalance();
        System.out.println("Fixed Deposit Interest: " + fixed.calculateInterest());
    }
}