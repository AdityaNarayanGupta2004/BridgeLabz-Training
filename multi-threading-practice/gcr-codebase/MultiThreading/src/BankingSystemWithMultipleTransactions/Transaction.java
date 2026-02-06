package BankingSystemWithMultipleTransactions;

public class Transaction implements Runnable{
	private BankAccount account;
	private int amount;
	private String customerName;
	
	public Transaction(BankAccount account, int amount, String customerName) {
		this.account = account;
		this.amount = amount;
		this.customerName = customerName;
	}

	@Override
	public void run() {
		account.Withdrawal(amount, customerName);
	}
}
