package BankingSystemWithMultipleTransactions;

public class BankAccount {
	int balance = 10000;
	
	public synchronized void Withdrawal(int amount, String customerName) {
		System.out.println("["+ customerName+"] Attempting to withdraw "+ amount);
		if(amount <= balance) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println("Transaction successful: "+ customerName+", Amount: "+amount+", Balance: "+ balance);
		}else {
			System.out.println("Transaction failed: "+ customerName+", Amount: "+amount+", Insufficient Balance: "+ balance);
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
