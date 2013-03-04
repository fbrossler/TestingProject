/**
 * 
 */
package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Felix Brossler
 * 
 */
public class AccountTest {

	private Account account;
	private Account defaultAccount;
	private Account nullAccount;

	private static final double INIT_ACCOUNT_BALANCE = 100.0;
	private static final String INIT_ACCOUNT_OWNER = "Maier";
	private static final double DELTA = 1e-15;

	@Before
	public void init() {
		this.account = new Account(AccountTest.INIT_ACCOUNT_OWNER,
				AccountTest.INIT_ACCOUNT_BALANCE);
		this.defaultAccount = new Account();

		this.nullAccount = new Account(null, 0.0);
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
		assertEquals(Account.NO_OWNER, nullAccount.getOwner());
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
	@Ignore
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bank.Account#getOwner()}.
	 */
	@Test
	@Ignore
	public void testGetOwner() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bank.Account#deposit(double)}.
	 */
	@Test
	public void testDeposit() {
		account.deposit(100);
		assertTrue("Testing Deposit insert 100 expect 200",
				account.getBalance() == 200);

	}

	@Test
	public void testNullDeposit() {
		account.deposit(0);
		assertTrue("Testing Deposti insert 0 expect 100",
				account.getBalance() == 100);
	}

	@Test(expected = RuntimeException.class)
	public void testNegativeDeposit() {
		account.deposit(-1);
	}

	/**
	 * Test method for {@link bank.Account#withdraw(double)}.
	 */
	@Test
	public void testWithdraw() {
		account.withdraw(50);
		assertTrue("Balance of account should be 50",
				account.getBalance() == 50);
		account.withdraw(50);
		assertTrue("Balance of account should be 0", account.getBalance() == 0);
	}

	@Test(expected = RuntimeException.class)
	public void testToMuchWithdraw() {
		account.withdraw(101);
	}

	@Test
	public void testEqualWithdraw() {
		account.withdraw(100);
		assertTrue("Balance should be 0", account.getBalance() == 0);
	}

}
