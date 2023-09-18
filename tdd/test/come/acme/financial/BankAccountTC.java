package come.acme.financial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.acme.financial.BankAccount;

class BankAccountTC {
		
	@Test
	void testConstructor() throws Exception {
		BankAccount a1 = new BankAccount(123, 2000);
		
		assertNotNull(a1, "bad bank object");
		
		assertEquals(123, a1.getAccountNumber());
		
		assertEquals(2000, a1.getBalance());
		
	}
	
	@Test
	void testDeposit() throws Exception {
		BankAccount a1 = new BankAccount(123, 2000);
		
		a1.deposit(1000);
		assertEquals(3000, a1.getBalance());
	}
		
	@Test
	void testwithdrawl() throws Exception {
		BankAccount a1 = new BankAccount(123, 2000);
		
		a1.withdrawl(500);
		assertEquals(1500, a1.getBalance());
						
	}

}
