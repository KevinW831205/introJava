package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount account = new BankAccount("12345-678",1000.00);

        Thread t1 =  new Thread() {
            public void run() {
                account.deposit(300.00);
                System.out.println("t1 deposited 300");
                account.withdraw(50.00);
                System.out.println("t1 withdrawn 50");

            }
        };

        Thread t2= new Thread(){
            public void run() {
                account.deposit(203.75);
                System.out.println("t2 deposited 203.75");
                account.withdraw(100);
                System.out.println("t2 withdrawn 100");
            }
        };

        t1.start();
        t2.start();


    }
}
