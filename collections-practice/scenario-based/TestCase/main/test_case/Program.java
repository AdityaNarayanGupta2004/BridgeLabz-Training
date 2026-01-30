package junit.demo.test_case;

public class Program {
	public double balance = 0;
	
	public Program(double balance){
		this.balance = balance;
	}
	
	public void Deposit(double amount) throws InvalidbalanceException{
		if(amount > 0) {
			balance += amount;
			return;
		}
		throw new InvalidbalanceException("Deposit amount cannot be negative");
	}
	
	public void Withdraw(double amount) throws InvalidbalanceException{
		if(amount <= balance) {
			balance -= amount;
			return;
		}
		throw new InvalidbalanceException("Insufficient funds.");
	}

}

