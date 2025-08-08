package labsessions._25_07;

import java.util.ArrayList;

class Bank {
	 private ArrayList<Account> accounts;

	    public Bank() {
	        accounts = new ArrayList<>();
	    }

	    public void addAccount(Account acc) {
	        accounts.add(acc);
	    }

	    public void showAllAccounts() {
	        for (Account acc : accounts) {
	            System.out.println("Account Balance: " + acc.getBalance());
	        }
	    }

	    public static void main(String[] args) {
	        Bank myBank = new Bank();

	        SavingsAccount savings = new SavingsAccount(1000);
	        CurrentAccount current = new CurrentAccount(500);

	        savings.deposit(200);
	        savings.applyInterest();
	        current.withdraw(700); // within overdraft

	        myBank.addAccount(savings);
	        myBank.addAccount(current);

	        myBank.showAllAccounts();
	    }
}
