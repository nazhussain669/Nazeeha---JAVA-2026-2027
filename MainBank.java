package javaPack;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for account information
        System.out.print("Enter account holder name: ");
        String name = input.nextLine();

        System.out.print("Enter account number: ");
        int accNum = input.nextInt();

        // Create the BankAccount object using user inputs
        BankAccount acct = new BankAccount(name, accNum);

        // Ask user for deposit amount
        System.out.print("Enter amount to deposit: ");
        double depAmount = input.nextDouble();
        acct.deposit(depAmount);

        // Ask user for withdrawal amount
        System.out.print("Enter amount to withdraw: ");
        double withAmount = input.nextDouble();
        boolean success = acct.withdraw(withAmount);

        // Display the results using accessors
        System.out.println("\nAccount Holder: " + acct.getAccountHolder());
        System.out.println("Account Number: " + acct.getAccountNumber());
        System.out.println("Withdrawal Successful: " + success);
        System.out.println("Final Balance: $" + acct.getBalance());

        input.close();
    }
}