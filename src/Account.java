/**
 * 
 */

/**
 * @author Felix Brossler
 * 
 */
public class Account {
	private static final String NO_OWNER = "No Owner";
	private static final double DEFAULT_BALACE = 0.0;
	private double balance;
	private final String owner;

	public Account() {
		this.owner = NO_OWNER;
		this.balance = DEFAULT_BALACE;
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

		}
	}

	public void withdraw(double money) {
		if (money > 0.0) {
			this.balance -= money;
		}
	}

}
