package Assesement_day5;

public class BankAccount {
	 private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Bank balance");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }


	public static void main(String[] args) {
		 BankAccount account = new BankAccount(5000);
	        account.deposit(2000);
	        account.withdraw(2500);
	        System.out.println("Balance: " + account.getBalance());

	}

}
