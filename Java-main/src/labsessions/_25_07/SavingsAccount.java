package labsessions._25_07;

 public class SavingsAccount implements Account{

	private double balance;
	
	private double interestRate = 0.04;
	
	
	 public SavingsAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }
	
	 
	 @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }
	 
	 @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds in Savings Account.");
	        }
	    }
	 
	 @Override
	    public double calculateInterest() {
	        return balance * interestRate;
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    public void applyInterest() {
	        balance += calculateInterest();
	    }
	 
	 
	 
	 
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
