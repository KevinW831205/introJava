package com.company;

public class AnotherClass {

    public String doSomething(){
        System.out.println("AnotherClass class's name is: "+getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("anonymous class name is: " +getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },"String1","String2");
    }

    public String doSomething2(){
        UpperConcat uc = (s1,s2) ->{
            System.out.println("Lambda expression's class is "+getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("AnotherClass class's name in Lambda is "+getClass().getSimpleName());
        return Main.doStringStuff(uc,"String1","String2");
    }
}
