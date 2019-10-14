package com.company;

public class ScopeCheck {
    public int publicint = 0;
    private int privateint = 1;

    public void scopeCheck(){
        System.out.println("public var: " + publicint + "private var: " + privateint);
    }

    public int getPrivateint() {
        return privateint;
    }

    public void timesTwo(){
//        int privateint = 2;
        for(int i=0; i<10; i++){
            System.out.println(i+" times two is "+i*privateint);
        }
    }

    public class InnerClass{
        private int privateint = 3;

        public InnerClass(){
            System.out.println("private int of inner class "+privateint );
        }

        public void timesTwo(){

            for(int i=0; i<10; i++){
                System.out.println(i+" times two is "+i*privateint);
            }
        }
    }


}
