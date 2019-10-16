package com.company;

public class SIBTest {
    public static final String owner;

    static {
        owner = "k";
        System.out.println("SIB static initialization block called");
    }

    public void SIBtest(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd initialzation block called");
    }

    public void someMethod(){
        System.out.println("Some method called");
    }


}
