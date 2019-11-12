package com.company;

public class SherlockSquare {
    public static void main(String[] args) {
        squares(24,49);
    }

    public static int squares(int a,int b){
        int count =0;
        for(int i=a; i<=b; i++){
           if(Math.sqrt(i) == Math.floor(Math.sqrt(i))){
               System.out.println(i);
               count++;
           }
        }
        return count;
    }
}
