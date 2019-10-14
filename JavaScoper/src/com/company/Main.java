package com.company;

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
    }
}
