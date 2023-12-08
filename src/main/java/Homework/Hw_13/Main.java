package Homework.Hw_13;


public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, 1000.0, "John Doe");
        BankAccount account2 = new BankAccount(1002, 500.0, "Jane Doe");

        System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());

        account1.transfer(200.0, account2); // Successful transfer
        account1.transfer(1200.0, account2); // Failed transfer

        System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());
    }
}