import java.util.*;
class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;
    // constructor
    Account(String accountNumber, Bank bank){
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public Bank getBank(){
        return bank;
    }
}

class Customer{
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void viewBalance(){
        System.out.println("Account balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println(
                "Account " + account.getAccountNumber() +" at " + account.getBank().getName() +": $" + account.getBalance());
        }
        System.out.println();
    }
}

class Bank {
    private String name;
    private ArrayList<Account> accounts;
    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public Account openAccount(Customer customer, String accountNumber){
        Account account = new Account(accountNumber, this);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }
}

public class BankAndAccountHolder {
    public static void main(String[] args){
        Bank bank = new Bank("National Bank");
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Account acc1 = bank.openAccount(alice, "A1001");
        Account acc2 = bank.openAccount(bob, "B2001");

        acc1.deposit(500);
        acc2.deposit(1000);

        alice.viewBalance();
        bob.viewBalance();
    }
}
