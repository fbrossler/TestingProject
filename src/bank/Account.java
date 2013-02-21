package bank;

/**
 * 
 */

/**
 * @author Felix Brossler
 * 
 */
public class Account {
	protected static final String NO_OWNER = "No Owner";
	protected static final double DEFAULT_BALACE = 0.0;
	private double balance;
	private final String owner;

	public Account() {
		this.owner = NO_OWNER;
		this.balance = DEFAULT_BALACE;
	}

	public Account(String accountOwner, double accountBalance) {
		if (accountOwner == null) {
			this.owner = NO_OWNER;
		} else {
			this.owner = accountOwner;
			this.balance = accountBalance;
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public void deposit(double money) {
		if (money >= 0.0) {
			this.balance += money;
		} else {
			throw new RuntimeException();
		}
	}

	public void withdraw(double money) {
		if (money > getBalance()) {
			throw new RuntimeException();
		}
		if (money >= 0.0) {
			this.balance -= money;
		}
	}

}
