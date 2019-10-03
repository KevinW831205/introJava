package com.company;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIPCustomer(){
        this("Default",0,"no email entered");
    }

    public VIPCustomer(String name, String email){
        this(name,0,email);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
