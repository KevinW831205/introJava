package com.company;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBranch(String branchName){
        if(findBranch(branchName)>=0){
            System.out.println("Branch name exists");
            return;
        }
        branches.add(new Branch(branchName));
    }

    private int findBranch(Branch branch){
        return branches.indexOf(branch);
    }

    private int findBranch(String name){
        for(int i =0; i<branches.size(); i++){
            Branch branch = branches.get(i);
            if(branch.getBranchName().equals(name));
            return i;
        }
        return -1;
    }

    public void addCustomerToBranch(String branchName, String customerName){
        int branchIndex = findBranch(branchName);
        if(branchIndex>=0){
            Branch BranchToAdd = branches.get(branchIndex);
            boolean success =  BranchToAdd.addCustomer(customerName);
            if(success){
                System.out.println("Created "+customerName +" account and added to "+branchName);
            } else {
                System.out.println("Error customer name exists");
            }
        } else {
            System.out.println("Can't find Branch");
        }
    }

    public void addTransactionForCustomerInBranch(String branchName, String customerName, int transactionAmount){
        int BranchIndex = findBranch(branchName);
        Branch customerBranch = branches.get(BranchIndex);
        customerBranch.addTransaction(customerName,transactionAmount);

    }

    public void printCustomersOfBranch(String branchName){
        int branchIndex = findBranch(branchName);
        Branch targetBranch = branches.get(branchIndex);
        targetBranch.printCustomers();
    }

    public void printCustomerTransaction(String branchName ,String customerName){
        int branchIndex = findBranch(branchName);
        if(branchIndex>=0){
            Branch targetBranch = branches.get(branchIndex);
            targetBranch.printCustomerTransaction(customerName);
        }else{
            System.out.println("Branch does not exist");
        }
    }

    public void printBranches(){
        System.out.println("Branches of "+getBankName());
        for(int i=0; i<branches.size();i++){
            System.out.println(branches.get(i).getBranchName());
        }
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
