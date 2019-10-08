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

    public void addTransaction(int amount){
        if(amount == 0){
            System.out.println("Invalid transaction");
        } else if(amount>0) {
            transactions.add(amount);
            System.out.println("Transaction Successful");
        } else {
            if(getBalance() + amount <0){
                System.out.println("Invalid Transaction Insufficient Balance");
            } else {
                transactions.add(amount);
                System.out.println("Transaction Successful");
            }
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
