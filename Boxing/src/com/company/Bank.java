package com.company;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(String branchName){
        if(findBranch(branchName)>=0){
            branches.add(new Branch(branchName));
            return;
        }
        System.out.println("Branch name exists");
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
        customerBranch.add

    }

    public void printCustomers(){

    }

    public void printCustomerTransaction(String customerName){

    }

}
