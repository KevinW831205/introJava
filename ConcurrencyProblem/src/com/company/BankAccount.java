package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    public void deposit(double amount) {
//        synchronized (this){
//            balance += amount;
//        }

        boolean status = false;
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                status = true;
                try {
                    balance += amount;
                }finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get lock");
            }
        }catch (InterruptedException e){
        }

        System.out.println("Transaction status = "+status);
    }

    public void withdraw(double amount) {
//        synchronized (this){
//            balance -= amount;
//        }

        boolean status= false;
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    status = true;
                    balance -= amount;
                }finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get lock");
            }
        }catch (InterruptedException e){
        }
        System.out.println("Transaction status = "+status);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = "+ getAccountNumber() );
    }


}