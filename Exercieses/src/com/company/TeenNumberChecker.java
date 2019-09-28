package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c){
        if(isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }
        return false;
    }

    public static boolean isTeen (int a){
        if(a>=13 && a <=19){
            return true;
        }
        return false;
    }
}
