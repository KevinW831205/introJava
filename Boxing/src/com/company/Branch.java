package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }


    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) >= 0) {
            return false;
        } else {
            customers.add(new Customer((customerName)));
            return true;
        }
    }

    private int findCustomer(Customer customerCheck) {
        return customers.indexOf(customerCheck);
    }

    private int findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    private int checkBalance(String customerName){
        int index = findCustomer(customerName);
        if(index>=0){
            return checkBalance(index);
        } else {
            System.out.println("can't find customer name");
            return -1;
        }
    }

    private int checkBalance(int customerIndex){
        Customer customer = customers.get(customerIndex);
        System.out.println(customer.getCustomerName() + "'s Account Transactions");
        customer.getTransactions();
        System.out.println("Balance: "+ customer.getBalance());
        return customer.getBalance();
    }

    public void addTransaction(String customerName, int amount){
        int customerIndex = findCustomer(customerName);
        if(customerIndex>=0){
            Customer targetCustomer = customers.get(customerIndex);
            targetCustomer.addTransaction(amount);
        } else {
            System.out.println("Can't find customer");
        }
    }

    public void printCustomers(){
        System.out.println(getBranchName() + " customers:");
        for(int i =0; i<customers.size();i++){
            System.out.println((i+1) +". "+customers.get(i).getCustomerName());
        }
    }

    public void printCustomerTransaction(String customerName){
        int customerIndex = findCustomer(customerName);
        if(customerIndex >= 0){
            Customer targetCustomer = customers.get(customerIndex);
            targetCustomer.printTransaction();
        } else {
            System.out.println("Unable to find customer");
        }
    }



}
