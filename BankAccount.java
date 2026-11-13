package javaPack;

public class BankAccount {
    //Declare private variables
    private String accountHolder;
    private int accountNumber;
    private double balance;

    //Constructor
    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Accessor Methods (Getters)
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //Mutator Methods (Setters & Transactions)
    public void setAccountHolder(String newName) {
        if (newName != null && !newName.equals("")) {
            this.accountHolder = newName;
        }
    }

    public void deposit(double amount) {
        // check
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Error! Deposit amount must be positive!");
        }
    }

    public boolean withdraw(double amount) {
        // check positive amount and sufficient funds
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Error! Invalid withdrawal amount or insufficient funds!");
            return false;
        }
    }
}