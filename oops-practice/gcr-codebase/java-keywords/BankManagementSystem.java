public class BankManagementSystem {
// class Bank {
    static String BankName = "State Bank of India";
    static int totalAccounts = 0;
    
    private final int accountNumber;
    String accountHolderName;
    double balance;
    public BankManagementSystem(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }
    static void gettotalAccounts() {
        System.out.println("Total Accounts in " + BankName + ": " + totalAccounts);
    }
    void Display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
    public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: $" + amount);
       } else {
           System.out.println("Invalid deposit amount.");
       }
    }
    public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn: $" + amount);
       } else {
           System.err.println("Insufficient balance or invalid amount.");
       }
   }
    public static void main(String[] args) {
        BankManagementSystem account1 = new BankManagementSystem(10, "mohan", 2000000.0);
        BankManagementSystem account2 = new BankManagementSystem(12, "ram ", 1000000.0);
        System.out.println("Account1 details are : ");
        account1.Display();
        System.out.println("Account2 Details are: ");
        account2.Display();
        BankManagementSystem.gettotalAccounts();
        System.out.println();
        account1.deposit(500);
        account1.withdraw(1000);
        account1.Display();
        account2.deposit(200);
        account2.withdraw(2000);
        account2.Display();
    }
}
