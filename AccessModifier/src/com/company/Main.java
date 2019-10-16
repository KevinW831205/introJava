package com.company;

public class Main {

    public int multiplier =7;

    public static void main(String[] args) {
	// write your code here

//        Account acc1 = new Account("acc1");
//        acc1.deposit(1000);
//        acc1.withdraw(500);
//        acc1.withdraw(-100);
//        acc1.deposit(-100);
//
//
//        acc1.calculateBalance();
//        //access modifier is public so can modify else where.
////        acc1.balance = 0;
//
//        System.out.println("Current Balance " + acc1.getBalance());


        //static
//        StaticTest firstInstance = new StaticTest("1st Instace");
//        System.out.println(firstInstance.getName() + " is instance number "+ firstInstance.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number "+secondInstance.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number "+secondInstance.getNumInstances());

//        int answer = multiply(7);
//
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());


        Password pass = new Password(12345);
        pass.storePassword();
    }

    public int multiply(int number){
        // need static method to be accessed in a static instance
        return number * multiplier;
    }

}
