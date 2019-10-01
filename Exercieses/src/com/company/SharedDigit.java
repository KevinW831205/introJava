package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int a,int b){
        if(a<10 || a > 99 || b <10 || b>99){
            return false;
        } else{
            int a1 = a%10;
            int a2 = a/10;
            int b1 = b%10;
            int b2 = b/10;

            if(a1 == b1 || a1 == b2 || b1 ==a2 || a2 ==b2){
                return true;
            }
            return false;

        }
    }
}
