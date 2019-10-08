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

}
