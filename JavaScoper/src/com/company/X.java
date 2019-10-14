package com.company;

import java.util.Scanner;

public class X {
    private int x;
    public X(Scanner x){
        System.out.println("Enter a number for its multiplication table");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x=1;  x<=12; x++){
            System.out.println( this.x+ "*" +  x + " = " + this.x*x);
        }
    }
}
