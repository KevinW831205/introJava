package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car jeep = new Car();
//        Car toyota = new Car();
//        System.out.println();
//        // jeep. to see methods and states related to class
//
//        jeep.setModel("compas");
//
//        jeep.setModel("compass");
//        String model1 = jeep.getModel();
//        System.out.println(model1);

//        BankAccount myAccount = new BankAccount();
//        BankAccount myAccount2 = new BankAccount("123456",300,"kevin2","234@123.com","123-123-1235");
//        BankAccount defaultAccount = new BankAccount();
//        BankAccount defaultAccount2 = new BankAccount("12342",30);
//
//        myAccount.setAccountNumber("12345");
//        myAccount.setBalance(500);
//        myAccount.setCustomerName("Kevin");
//        myAccount.setEmail("123@123.com");
//        myAccount.setPhoneNumber("123-123-1234");
//        System.out.println("account number: "+myAccount.getAccountNumber());
//        System.out.println("balance: "+myAccount.getBalance());
//        System.out.println("holder name: "+myAccount.getCustomerName());
//        System.out.println("email: "+myAccount.getEmail());
//        System.out.println("phone: "+myAccount.getPhoneNumber());
//        myAccount.depost(-400);
//        myAccount.depost(400);
//        myAccount.withdraw(300);
//        myAccount.withdraw(-300);
//        myAccount.withdraw(3000);
//
//        System.out.println("account number: "+myAccount2.getAccountNumber());
//        System.out.println("balance: "+myAccount2.getBalance());
//        System.out.println("holder name: "+myAccount2.getCustomerName());
//        System.out.println("email: "+myAccount2.getEmail());
//        System.out.println("phone: "+myAccount2.getPhoneNumber());
//
//        System.out.println("account number: "+defaultAccount.getAccountNumber());
//        System.out.println("balance: "+defaultAccount.getBalance());
//        System.out.println("holder name: "+defaultAccount.getCustomerName());
//        System.out.println("email: "+defaultAccount.getEmail());
//        System.out.println("phone: "+defaultAccount.getPhoneNumber());
//
//        System.out.println("account number: "+defaultAccount2.getAccountNumber());
//        System.out.println("balance: "+defaultAccount2.getBalance());
//        System.out.println("holder name: "+defaultAccount2.getCustomerName());
//        System.out.println("email: "+defaultAccount2.getEmail());
//        System.out.println("phone: "+defaultAccount2.getPhoneNumber());
//
        VIPCustomer c1 = new VIPCustomer();
        VIPCustomer c2 = new VIPCustomer("Kevin",3000, "123@123.com");
        VIPCustomer c3 = new VIPCustomer("kevin","0@0.com");

        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmail());
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmail());



    }
}
