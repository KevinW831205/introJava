package com.company;

import java.util.ArrayList;

//private class Account {   // not doable
//class Account {  //package private

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount >0){
            balance+= amount;
            transactions.add(amount);
            System.out.println("Deposited "+amount);
        } else {
            System.out.println("Deposit error");
        }
    }

    public void withdraw(int amount){
        if(amount >0){
            balance -= amount;
            transactions.add(-amount);
            System.out.println("withdraw "+amount);
        } else {
            System.out.println("Withdraw error");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i: this.transactions){
            this.balance += i;
        }
        System.out.println("current balance "+this.balance);
    }

}
