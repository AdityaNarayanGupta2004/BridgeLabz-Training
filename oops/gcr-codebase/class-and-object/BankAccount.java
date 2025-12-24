import java.util.*;
public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    double amount;

    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }
    double deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        return balance;
    }
    double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount is : " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
        return balance;
    }
    public void displayDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Account Number:");
        String number = sc.nextLine();
        
        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();
        
        System.out.println("Enter Amount to Deposit/Withdraw:");
        double amount = sc.nextDouble();
        BankAccount account = new BankAccount(name, number, balance);
        
        System.out.println("Bank Account Details are:  ");
        account.displayDetails();
        account.deposit(amount);
        account.withdraw(amount);
    }
}
