package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String privateInt = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope instance private " + scopeInstance.getPrivateint());
        System.out.println(privateInt);
        scopeInstance.scopeCheck();
        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
        scopeInstance.useInner();
        System.out.println(innerClass.var2);
//        System.out.println(innerClass.var1);


        X x = new X(new Scanner(System.in));
        x.x();

    }


}
