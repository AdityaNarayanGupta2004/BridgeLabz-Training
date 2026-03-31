package junit.demo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;
    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }
    @Test
    void testWithdrawSuccess() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.01);
    }
    @Test
    void testWithdrawFail() {
        account.withdraw(1500.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }
    @Test
    void testNegativeDeposit() {
        account.deposit(-100.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }
    @Test
    void testMultipleTransactions() {
        account.deposit(200.0);
        account.withdraw(150.0);
        assertEquals(1050.0, account.getBalance(), 0.01);
    }
}
