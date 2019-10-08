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
}
