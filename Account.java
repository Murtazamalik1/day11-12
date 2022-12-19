package com.assignemnt;

public class Account {
    private double balance;

    public Account(double initial_balance){ // constructor

        if (initial_balance > 0.0)
           balance = initial_balance;
    }
    // add amount to the account
    public void credit(double amount)
    {
        balance = balance + amount;
    }
    // debit the account

    public void debit(double debit_account){
        if (debit_account > balance){
            debit_account = 0.0;
            System.out.println("Debit amount exceeded account balance.");
        }
        balance = balance - debit_account;
    }
    public double getBalance() //return the account balance
    {
        return balance;
    }

    public static void main(String args[]) {
        Account account1 = new Account(50.00); // create Account object
        Account account2 = new Account(-7.53); // create Account object

    }
}


