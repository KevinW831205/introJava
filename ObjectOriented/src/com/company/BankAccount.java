package com.company;

public class BankAccount {
    String accountNumber;
    int balance;
    String customerName;
    String email;
    String phoneNumber;

    // constructor
    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        // major constructor
        // try not to call other method in constructor code.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this("00000", 0, "default", "default", "default");
        System.out.println("constructor ran with default values");
    }

    public BankAccount(String accountNumber, int balance) {
        this(accountNumber, balance, "none", "none", "none");
    }


    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.isEmpty()) {
            System.out.println("Cannot enter blank");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("Cannot have negative balance");
        } else {
            this.balance = balance;
        }
    }

    public void setCustomerName(String customerName) {
        if (customerName.isEmpty()) {
            System.out.println("Cannot enter blank");
        } else {
            this.customerName = customerName;
        }
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("Cannot enter blank");
        } else {
            this.email = email;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) {
            System.out.println("Cannot enter blank");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void depost(int deposit) {
        if (deposit <= 0) {
            System.out.println("must deposit a positive number");
        } else {
            this.balance += deposit;
            System.out.println("deposited " + deposit + ", remaining " + this.balance);

        }
    }

    public void withdraw(int withdraw) {
        if (withdraw <= 0) {
            System.out.println("must withdraw a positive number");
            return;
        }

        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdraw;
            System.out.println("withdrew " + withdraw + ", remaining " + this.balance);
        }


    }
}
