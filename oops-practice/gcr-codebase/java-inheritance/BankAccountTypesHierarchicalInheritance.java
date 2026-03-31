class BankAccount {
    String accountNumber;
    double balance;
    // constructor
    BankAccount(String accNum, double bal) {
        this.accountNumber = accNum;
        this.balance = bal;
    }
}
// subclass of BankAcount
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accNum, double bal, double rate) {
        super(accNum, bal);
        this.interestRate = rate;
    }
    void displayAccountType() {
        System.out.println("Savings Account with interest: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accNum, double bal, double limit) {
        super(accNum, bal);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Checking Account with limit: $" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int termMonths;
    FixedDepositAccount(String accNum, double bal, int term) {
        super(accNum, bal);
        this.termMonths = term;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit for " + termMonths + " months");
    }
}

public class BankAccountTypesHierarchicalInheritance {
    public static void main(String[] args) {
        SavingsAccount savingAcc = new SavingsAccount("4567", 100000, 5);
        savingAcc.displayAccountType();
        CheckingAccount checkingAcc = new CheckingAccount("4567", 100000, 1000);
        checkingAcc.displayAccountType();
        FixedDepositAccount fixedAcc = new FixedDepositAccount("4567", 100000, 12);
        fixedAcc.displayAccountType();
    }
}
