package Homework.Hw_13;

public class BankAccount {
    private final int accountNumber;
    private double balance;
    private String ownerName;
    private static int numberOfAccounts = 0;

    static {
        System.out.println("Class BankAccount was launched :) ");
    }

    public BankAccount(int accountNumber, double balance, String ownerName) {

        this.balance = balance;
        this.ownerName = ownerName;
        this.accountNumber = ++numberOfAccounts;

    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public double transfer(double amount, BankAccount recipientAccount) {
        if (amount > 0 && amount <= balance) {
            this.balance -=amount;
            recipientAccount.deposit(amount);

            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.err.println("Transfer failed. Insufficient funds or invalid amount.");
        }
        return balance;

    }

        private void deposit (double amount){
        if (amount>0) {
                this.balance += amount;
                System.out.println("Deposit successful. New balance: : "+balance);
            }else{
                System.out.println("Deposit failed.");

            }

        }
    }





