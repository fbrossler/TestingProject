/**
 * 
 */
package bank;

import java.util.List;

/**
 * @author Felix Brossler
 * 
 */
public class Bank {
	private static final int ACCOUNTBASE = 30100815;
	private static final String NO_ACCOUNTS = "there are no accounts";
	private List<Account> accounts;

	public Bank() {

	}

	public int accountsAmount() {
		return this.accounts.size();
	}

	public void openAccount(String owner, double balance) {
		if (owner != null && balance >= 0) {
			this.accounts.add(new Account(owner, balance,
					getFreeAccountnumber()));
		} else {
			throw new RuntimeException();
		}
	}

	private int getFreeAccountnumber() {
		int currentFreeAccountnumber;
		if (this.accounts.size() == 0 || this.accounts.isEmpty()) {
			currentFreeAccountnumber = ACCOUNTBASE;
		} else {
			currentFreeAccountnumber = this.accounts.size() + ACCOUNTBASE;
		}

		return currentFreeAccountnumber;
	}

	protected List<Account> getAccounts(String owner) {

		List<Account> ownerAccounts = null;
		if (this.accounts != null && !this.accounts.isEmpty() && owner != null) {
			for (int i = 0; i < this.accounts.size(); i++) {
				if (this.accounts.get(i).getOwner().equals(owner)) {
					ownerAccounts.add(this.accounts.get(i));
				}
			}
		} else {
			throw new RuntimeException(NO_ACCOUNTS);
		}

		return ownerAccounts;
	}

	protected Account getAccount(int accountNumber) {
		Account account = null;
		if (accountNumber >= ACCOUNTBASE) {
			for (int i = 0; i < this.accounts.size(); i++) {
				if (this.accounts.get(i).getNumber() == accountNumber) {
					account = this.accounts.get(i);
				}
			}
		} else {
			throw new RuntimeException();
		}
		return account;
	}

	protected float tradeAccounts() {
		float trade = 0;
		if (this.accounts.isEmpty()) {
			trade = 0;
		} else {
			for (int i = 0; i < this.accounts.size(); i++) {
				trade += this.accounts.get(i).getBalance();
			}
		}
		return trade;
	}
}
