package Assessment_day7;
class BankAccount {
    int balance = 1000;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
    }
}

public class Bankaccount {

	public static void main(String[] args) {
		  BankAccount account = new BankAccount();

	        Thread t1 = new Thread(() -> account.deposit(500));
	        Thread t2 = new Thread(() -> account.withdraw(200));

	        t1.start();
	        t2.start();
	}

}
