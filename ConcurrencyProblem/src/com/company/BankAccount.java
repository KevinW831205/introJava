package com.company;

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

        lock.lock();
        try{
            balance += amount;
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
//        synchronized (this){
//            balance -= amount;
//        }
        lock.lock();
        try{
            balance -= amount;
        }finally {
            lock.unlock();
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = "+ getAccountNumber() );
    }


}