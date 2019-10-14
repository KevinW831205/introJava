package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account acc1 = new Account("acc1");
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(-100);
        acc1.deposit(-100);


        acc1.calculateBalance();
        //access modifier is public so can modify else where.
//        acc1.balance = 0;

        System.out.println("Current Balance " + acc1.getBalance());

    }

}
