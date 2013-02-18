/**
 * 
 */
package bank;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Felix Brossler
 * 
 */
public class AccountTest {

	private Account account;
	private Account defaultAccount;

	private static final double INIT_ACCOUNT_BALANCE = 0.01;
	private static final String INIT_ACCOUNT_OWNER = "Maier";

	@Before
	public void init() {
		this.account = new Account(AccountTest.INIT_ACCOUNT_OWNER,
				AccountTest.INIT_ACCOUNT_BALANCE);
		this.defaultAccount = new Account();
	}

	/**
	 * Test method for {@link bank.Account#Account()}.
	 */
	@Test
	public void testDefaultAccount() {
		assertTrue("TestDefaultAccountOwner",
				defaultAccount.getOwner().equals(Account.NO_OWNER));
		assertTrue("TestDefaultAccountBalance",
				defaultAccount.getBalance() == Account.DEFAULT_BALACE);
	}

	@Test
	public void testAccount() {
		assertTrue("TestAccountOwner",
				account.getOwner().equals(INIT_ACCOUNT_OWNER));
		assertTrue("TestAccountBalance",
				account.getBalance() == INIT_ACCOUNT_BALANCE);
	}

	/**
	 * Test method for {@link bank.Account#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bank.Account#getOwner()}.
	 */
	@Test
	public void testGetOwner() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bank.Account#deposit(double)}.
	 */
	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bank.Account#withdraw(double)}.
	 */
	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

}
