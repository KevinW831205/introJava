package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Integer> transactions;

    public Customer(String name) {
        this.customerName = name;
        transactions = new ArrayList<Integer>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Integer> getTransactions() {
        return transactions;
    }

    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amount){
        if(amount>0){
            if(getBalance() - amount >= 0){
                transactions.add(amount * -1);
                System.out.println("Withdrew "+amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    public int getBalance(){
        int sum =0;
        for(int i=0; i<transactions.size();i++){
            sum += transactions.get(i).intValue();
        };
        return sum;
    }

    public void printTransaction(){
        for(int i=0; i<transactions.size();i++){
            System.out.println(transactions.get(i).intValue());
        };
    }
}
