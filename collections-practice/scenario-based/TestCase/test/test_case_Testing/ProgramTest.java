package junit.demo.test_case_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import junit.demo.test_case.InvalidbalanceException;
import junit.demo.test_case.Program;

public class ProgramTest {
	
	@Test
	public void Test_Deposit_ValidAmount() throws InvalidbalanceException {
		Program program = new Program(50000.0);
		program.Deposit(1000.0);
		assertEquals(51000.0, program.balance);
	}
	
	@Test
	public void Test_Deposit_NegativeAmount() throws InvalidbalanceException {
		Program program = new Program(50000.0);
//		assertThrows(InvalidbalanceException.class,()->program.Deposit(-51000.0));
		assertEquals("Deposit amount cannot be negative", assertThrows(InvalidbalanceException.class,()->program.Deposit(-51000.0)).getMessage());
	}
	
	@Test
	public void Test_Withdraw_ValidAmount() throws InvalidbalanceException {
		Program program = new Program(100000.0);
		program.Withdraw(10000.0);
		assertEquals(90000.0, program.balance);
	}
	
	@Test
	public void Test_Withdraw_InsufficientFunds() throws InvalidbalanceException {
		Program program = new Program(100000.0);
		assertThrows(InvalidbalanceException.class,()-> program.Withdraw(110000.0));
	}
}
