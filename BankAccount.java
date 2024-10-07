package BankAccount;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}
