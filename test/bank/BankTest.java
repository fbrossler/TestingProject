/**
 * 
 */
package bank;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Felix Brossler
 * 
 */
public class BankTest {

	private Bank bank;

	@Before
	public init() {
		bank = new Bank();
	}

	@Test
	@Ignore
	public void bankOpenAccountTest() {
		this.bank.openAccount("Hans", 0.0);
		assertTrue("Test bank size", this.bank.accountsAmount() == 1);
	}

}
